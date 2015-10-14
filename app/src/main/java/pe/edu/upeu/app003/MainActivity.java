package pe.edu.upeu.app003;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button boton = (Button) findViewById(R.id.btnEntrar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usuario = ((EditText) findViewById(R.id.editUsuario)).getText().toString();
                String pass = ((EditText) findViewById(R.id.edtPass)).getText().toString();

                if (usuario.equals("manuel") && pass.equals("123456")) {

                    Intent nuevoform = new Intent(MainActivity.this, PrincipalActivity.class);
                    startActivity(nuevoform);


                } else {
                    Toast.makeText(getApplicationContext(), "Usuario incorrecto", Toast.LENGTH_SHORT).show();
                }

            }
        });









    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.cajero_saldo) {
            return true;
        }

        if (id == R.id.cajero_depositar) {
            return true;
        }

        if (id == R.id.cajero_retirar) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
