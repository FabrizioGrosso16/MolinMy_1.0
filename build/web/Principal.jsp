<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css" />
    <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"></script>
    <title>TODO supply a title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="newcss.css">
</head>
<body>
    <div>MolinMy</div>
    <div id="map" style="height: 400px;"></div>
    <script>
        var map = L.map('map').setView([4, -0.09], 13);
        L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
            maxZoom: 19,
        }).addTo(map);
        map.on('click', function(e) {
            var popup = L.popup()
                .setLatLng(e.latlng)
                .setContent("Latitud: " + e.latlng.lat.toFixed(5) + "<br>Longitud: " + e.latlng.lng.toFixed(5))
                .openOn(map);

            L.marker(e.latlng).addTo(map);
        });
    </script>
    
</body>
</html>
