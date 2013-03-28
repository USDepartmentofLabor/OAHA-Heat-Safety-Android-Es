package com.erg.heatindexspanish;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TableRow;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText; 
import android.content.Intent;


//testing
import android.location.LocationManager;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;


import java.util.Date;
import java.text.SimpleDateFormat;

import java.util.Vector;

//for links -jm
import android.text.Html; 
import android.text.method.LinkMovementMethod;


public class firstaid extends Activity {
	private final String DEBUG_TAG = "HeadIndex";
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstaid);    
        
        TextView myEdit = ((TextView) findViewById(R.id.titletxt));         
        myEdit.setText("Enfermedad a Causa del Calor: Primeros Auxilios");
        myEdit.setContentDescription("Enfermedad a Causa del Calor: Primeros Auxilios");
         
        // row 1
        TextView info11text = (TextView) findViewById(R.id.info11text);
        TextView info12text = (TextView) findViewById(R.id.info12text);
        TextView info13text = (TextView) findViewById(R.id.info13text);
        TextView info14text = (TextView) findViewById(R.id.info14text);
        TextView info15text = (TextView) findViewById(R.id.info15text);
        TextView info16text = (TextView) findViewById(R.id.info16text);
        TextView info17text = (TextView) findViewById(R.id.info17text);
        
        //Heat stroke
        info11text.setText("LA INSOLACIÓN ES UNA EMERGENCIA. Llame al 911.\nMientras espera por ayuda:");
        //info11text.setContentDescription("LA INSOLACIÓN ES UNA EMERGENCIA. Llame al 911. Mientras espera por ayuda");
        
        info12text.setText("Coloque al trabajador en la sombra, en un área fresca");
        //info12text.setContentDescription("Coloque al trabajador en la sombra, en un área fresca");
        
        info13text.setText("Afloje la ropa, quite la ropa exterior");
        //info13text.setContentDescription("Afloje la ropa, quite la ropa exterior");
        
        info14text.setText("Dé aire al trabajador, coloque paquetes de hielo en las axilas");
        //info14text.setContentDescription("Dé aire al trabajador, coloque paquetes de hielo en las axilas");
        
        info15text.setText("Moje al trabajador con agua fría, aplique compresas frías o hielo si está disponible");
        //info15text.setContentDescription("Moje al trabajador con agua fría, aplique compresas frías o hielo si está disponible");
        
        info16text.setText("Proporcione líquidos (preferentemente agua) tan pronto como sea posible");
        //info16text.setContentDescription("Proporcione líquidos (preferentemente agua) tan pronto como sea posible");
        
        info17text.setText("Quédese con el trabajador hasta que llegue ayuda");
        //info17text.setContentDescription("Quédese con el trabajador hasta que llegue ayuda");
   
        // row 2       
        TextView info21text = (TextView) findViewById(R.id.info21text);
        TextView info22text = (TextView) findViewById(R.id.info22text);
        TextView info23text = (TextView) findViewById(R.id.info23text);
        TextView info24text = (TextView) findViewById(R.id.info24text);
        TextView info25text = (TextView) findViewById(R.id.info25text);
        
        //Heat exhaustion
        info21text.setText("Procure que el trabajador se siente o se acueste en la sombra en un área fresca");
        //info21text.setContentDescription("Procure que el trabajador se siente o se acueste en la sombra en un área fresca");
        
        info22text.setText("Dele a beber agua u otras bebidas frescas en cantidades abundantes");
        //info22text.setContentDescription("Dele a beber agua u otras bebidas frescas en cantidades abundantes");
       
        info23text.setText("Refresque al trabajador con compresas de agua fría/hielo");
        //info23text.setContentDescription("Refresque al trabajador con compresas de agua fría/hielo");
        
        info24text.setText("Llévelo a una clínica o sala de emergencias para una evaluación y tratamiento médico si los signos o síntomas empeoran o no mejoran en 60 minutos");
        //info24text.setContentDescription("Llévelo a una clínica o sala de emergencias para una evaluación y tratamiento médico si los signos o síntomas empeoran o no mejoran en 60 minutos");
        
        info25text.setText("El trabajador no debe volver al trabajo ese día");
        //info25text.setContentDescription("El trabajador no debe volver al trabajo ese día");
        
        // row 4
        TextView info41text = (TextView) findViewById(R.id.info41text);
        TextView info42text = (TextView) findViewById(R.id.info42text);
        TextView info43text = (TextView) findViewById(R.id.info43text);
        TextView info44text = (TextView) findViewById(R.id.info44text);
        
        //Heat cramps
        info41text.setText("Procure que el trabajador descanse en la sombra, en un área fresca");
        //info41text.setContentDescription("Procure que el trabajador descanse en la sombra, en un área fresca");
        
        info42text.setText("Procure que el trabajador tome agua u otra bebida fría");
        //info42text.setContentDescription("Procure que el trabajador tome agua u otra bebida fría");
        
        info43text.setText("Espere unas horas antes de permitir que el trabajador vuelva al trabajo pesado");
        //info43text.setContentDescription("Espere unas horas antes de permitir que el trabajador vuelva al trabajo pesado");
        
        info44text.setText("Busque atención médica si los calambres no desaparecen"); 
        //info44text.setContentDescription("Busque atención médica si los calambres no desaparecen");
        
        // row 5
        TextView info51text = (TextView) findViewById(R.id.info51text);
        TextView info52text = (TextView) findViewById(R.id.info52text);
        
        //Heat rash
        info51text.setText("Si es posible, trate de trabajar en un lugar más fresco y menos húmedo");
        //info51text.setContentDescription("Si es posible, trate de trabajar en un lugar más fresco y menos húmedo");
        
        info52text.setText("Mantenga seca la zona afectada");
        //info52text.setContentDescription("Mantenga seca la zona afectada");
    
        // Info buttons
        Button	signs_button1 = (Button) findViewById(R.id.firstaid_button1);
        signs_button1.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent goMainMenu = new Intent(firstaid.this, signsandsymptoms.class);
			    startActivity(goMainMenu);  
			}
		});
        Button	signs_button2 = (Button) findViewById(R.id.firstaid_button2);
        signs_button2.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent goMainMenu = new Intent(firstaid.this, signsandsymptoms.class);
			    startActivity(goMainMenu);  
			}
		});

        Button	signs_button4 = (Button) findViewById(R.id.firstaid_button4);
        signs_button4.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent goMainMenu = new Intent(firstaid.this, signsandsymptoms.class);
			    startActivity(goMainMenu);  
			}
		});
        Button	signs_button5 = (Button) findViewById(R.id.firstaid_button5);
        signs_button5.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent goMainMenu = new Intent(firstaid.this, signsandsymptoms.class);
			    startActivity(goMainMenu);  
			}
		});
                
        
      //navaigation buttons
        Button home_button = (Button) findViewById(R.id.home_button);
        home_button.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) { 
        	   Intent goNext = new Intent(firstaid.this, HeatIndex.class);
        	   startActivity(goNext);
        	   //finish();
           } 
        });
        
        //back button
        Button back_button = (Button) findViewById(R.id.back_button);
          back_button.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) { 
          	   finish();
             } 
          });
        
        Button main_button = (Button) findViewById(R.id.main_button);
        main_button.setOnClickListener(new View.OnClickListener() {

    		@Override
    		public void onClick(View v) {      			
    			 Intent goMainMenu = new Intent(firstaid.this, moreinfo.class);
    		     startActivity(goMainMenu);    			
    		}
    	});  
    }  
}
       