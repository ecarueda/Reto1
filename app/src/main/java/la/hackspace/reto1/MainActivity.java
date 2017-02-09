package la.hackspace.reto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map = ((MapFragment)
                getFragmentManager().findFragmentById(R.id.fragmentMapa)).getMap();

        if (map != null) {
            map.addMarker(new MarkerOptions()

                    .position(new LatLng(-12.122295, -77.027274))
                    .title("Ubicación de Recojo")
                    .snippet("Av. Ernesto Diez Canseco 219, Miraflores"));

            map.addMarker(new MarkerOptions()

                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                    .position(new LatLng(-12.121425, -77.026879))
                    .title("Taxi"));

            map.addMarker(new MarkerOptions()

                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                    .position(new LatLng(-12.123308, -77.027847))
                    .title("Taxi"));

            map.addMarker(new MarkerOptions()

                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                    .position(new LatLng(-12.12196, -77.029022))
                    .title("Taxi"));

            map.addMarker(new MarkerOptions()

                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                    .position(new LatLng( -12.121693, -77.027729))
                    .title("Taxi"));

        }

    }
}
