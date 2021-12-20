$(document).ready(function () {
    var container = document.getElementById('map');
    var options = {
        center: new kakao.maps.LatLng(35.7401696, 127.119333),
        level: 5
    };

    var map = new kakao.maps.Map(container, options);

    // 마커가 표시될 위치입니다
    var markerPosition = new kakao.maps.LatLng(35.7401696, 127.119333);

    // 마커를 생성합니다
    var marker = new kakao.maps.Marker({
        position: markerPosition
    });

    // 마커가 지도 위에 표시되도록 설정합니다
    marker.setMap(map);

    // 마커에 클릭이벤트를 등록합니다
    kakao.maps.event.addListener(marker, 'click', function () {
        location.href = 'https://map.kakao.com/?urlX=527344&urlY=623038&urlLevel=3&itemId=1116918709&q=%EA%B5%AC%EC%9D%B4%EC%95%A4%EA%B8%88%EC%9A%B0%ED%86%B5%EC%8B%A0&srcid=1116918709&map_type=TYPE_MAP'
    });

    var $root = $('html, body');
    $('.nav-links a').click(function () {
        $root.animate({
            scrollTop: $($.attr(this, 'href')).offset().top - 147.7
        }, 500);
        return false;
    });

});
