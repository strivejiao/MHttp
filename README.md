### MHttp 使用指南

VHttp网络基础库是基于Retrofit+RxJava开发的，通过封装Retrofit和RxJava，打造的轻便、易用的网络访问库；

#### 初始化

```
VHttp.CONFIG()
.baseUrl(baseUrl)
.httpHeaders(headers)
.log(true)
.interceptor(new HttpLogInterceptor().setLevel(HttpLogInterceptor.Level.BODY));
```

**baseUrl**：基础URL，即你要访问的服务器地址。

**httpHeaders** ：通用请求头，访问服务器添加请求头数据，创建方式如下：

```
 Map<String, String> headers = new HashMap<>();
 headers.put("mKey", "mobile");
 headers.put("version", "V1.0%281%29");
 headers.put("imei", "351670062419259");
```

**log** ：log日志开关

**interceptor** ：拦截器，可以根据需求传入相应的拦截器，以上示例传入的是日志拦截器，并且设置了日志拦截器的拦截等级，拦截器可以自定义，只需继承Interceptor接口即可。

#### GET请求示例

```
VHttp.GET(suffixUrl).request(new ACallback<Object>() {

            @Override
            public void onSuccess(Object result) {

            }

            @Override
            public void onFail(int errorCode, String errorMsg) {

            }
        });
```

**suffixUrl**：请求的接口地址

**ACallback**：Object是接口返回的bean对象，根据需求定义即可

#### POST请求示例

```
VHttp.POST(suffixUrl)
                .tag(tag)
                .addForm(key, value)
                .request(new ACallback<Object>() {

                    @Override
                    public void onSuccess(Object result) {

                    }

                    @Override
                    public void onFail(int errorCode, String errorMsg) {

                    }
                });
```

**suffixUrl**：请求的接口地址

**ACallback**：Object是接口返回的bean对象，根据需求定义即可

**tag**：是请求标志，方便取消或重试请求

**addForm**：是以key value的形式添加参数，也可以用Map集合添加参数

```
 VHttp.POST(suffixUrl)
                .tag(netTag)
                .addParams(Map)
```

如果我们在POST请求中想获取接口返回的源数据，即未解析的json字符串，可以按照以下代码处理：

```
       VHttp.POST(suffixUrl)
                .tag(tag)
                .addParams(Map)
                .request(new ACallback<String>() {

                    @Override
                    public void onSuccess(String result) {

                    }

                    @Override
                    public void onFail(int errorCode, String errorMsg) {

                    }
                });
```

即在ACallback回调中传入String即可
