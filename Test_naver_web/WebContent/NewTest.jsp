<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
<title>간단한 지도 표시하기</title>
<script type="text/javascript"
	src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=Xv3GyWmGGeKkG4cBYlM3&submodules=geocoder"></script>
<script src="./js/jquery-3.3.1.min.js"></script>
</head>
<body>
	<div id="map" style="width: 100%; height: 1000px;" ></div>
	<div><h2 id="aaa">마커찍기</h2></div>
	<script>
		var map = new naver.maps.Map(
				'map',
				{
					center : new naver.maps.Point(64, 64),
					zoom : 1,
					mapTypes : new naver.maps.MapTypeRegistry(
							{
								'greenfactory' : new naver.maps.ImageMapType(
										{
											name : 'greenfactory',
											minZoom : 0,
											maxZoom : 3,
											tileSize : 256,
											projection : {
												fromPointToCoord : function(
														point) {
													return point.clone().mul(
															128, 128);
												},
												fromCoordToPoint : function(
														coord) {
													return coord.clone().div(
															128, 128);
												}
											},
											repeatX : false,
											//tileSet : 'https://navermaps.github.io/maps.js/docs/tiles/gf-1f/{z}/{x}-{y}.png',
											tileSet : './imgs/draw{z}_{y}_{x}.jpg',
											vendor : '\xa9 NAVER Corp.',
											uid : 'naver:greenfactory'
										})
							}),
					mapTypeId : 'greenfactory',
					zoomControl : true,
					zoomControlOptions : {
						position : naver.maps.Position.TOP_RIGHT
					}
				});

		var gridLayer = new naver.maps.Layer(
				'tileGrid',
				{
					name : 'tileGrid',
					minZoom : 0,
					maxZoom : 3,
					tileSize : [ 256, 256 ],
					getTile : function(x, y, z) {
						var div = $('<div style="width:256px;height:256px;border:1px solid red;color:red;"><span style="font-weight:bold">'
								+ z
								+ '</span> - ('
								+ [ x, y ].join(',')
								+ ')</div>');

						var extent = Math.pow(2, z);

						if (x > -1 && y > -1 && z > -1 && x < extent
								&& y < extent) {
							return div[0];
						} else {
							return null;
						}
					}
				});

		gridLayer.setMap(map);
		$("#aaa").on("click",function(){
			var marker = new naver.maps.Marker({
	            map: map
	        });
			var point=new naver.maps.Point(80, 80);
			marker.setPosition(point);
			
			
		})
		var markerList=[];
		naver.maps.Event.addListener(map, 'click', function(e) {
	        var marker = new naver.maps.Marker({
	            position: e.coord,
	            map: map
	        });

	        markerList.push(marker);
	        
	        naver.maps.Event.addListener(marker, "click", function(e) {
			    if (infowindow.getMap()) {
			        infowindow.close();
			    } else {
			        infowindow.open(map, marker);
			    }
			    alert(marker.getPosition());
			});
	    });
		var contentString = [
	        '<div class="iw_inner">',
	        '   <h2>대화방이 들어갈곳</h2>',
	        '</div>'
	    ].join('');
		
		var infowindow = new naver.maps.InfoWindow({
		    content: contentString,
		    maxWidth: 140,
		    backgroundColor: "#eee",
		    borderColor: "#2db400",
		    borderWidth: 5,
		    anchorSize: new naver.maps.Size(30, 30),
		    anchorSkew: true,
		    anchorColor: "#eee",
		    pixelOffset: new naver.maps.Point(20, -20)
		});
		
		

		
	</script>
</body>
</html>