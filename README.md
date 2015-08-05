# geohash-java
a Java implement of Geohash

#### 提供下列接口：

|Modifier and Type|	Method and Description|
|---|---|
|String|toGeoHash(double lng, double lat)<br> 根据经纬度计算 geohash|
|String|toGeoHash(double lng, double lat, int level)<br> 根据经纬度转换为指定长度的 geohash|
|GPS|toGPS(String geohash)<br> 将 geohash 转换成gps，GPS 类包含经纬度两个值|
|List\<String\>|getRound8(String geohash)<br>根据给定的geohash计算出周围8个 geohash |

性能方面在笔记本上随便测试了一下，getRound8 在 50w 上下，其他每个接口都在百万以上。
