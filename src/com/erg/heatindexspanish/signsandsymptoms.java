package com.erg.heatindexspanish;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText; 
import android.widget.TableRow;
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




public class signsandsymptoms extends Activity {
	private final String DEBUG_TAG = "HeadIndex";
	

	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signsandsymptoms);    
        
        TextView myEdit = ((TextView) findViewById(R.id.titletxt));      
        myEdit.setText("Enfermedad a Causa del Calor: Signos y Síntomas");
        myEdit.setContentDescription("Enfermedad a Causa del Calor: Signos y Síntomas"); 
        
        // row 1
        TextView info11text = (TextView) findViewById(R.id.info11text);
        TextView info12text = (TextView) findViewById(R.id.info12text);
        TextView info13text = (TextView) findViewById(R.id.info13text);
        TextView info14text = (TextView) findViewById(R.id.info14text);
        TextView info15text = (TextView) findViewById(R.id.info15text);
        
        //Heat stroke
        info11text.setText("Piel enrojecida, caliente y seca o sudoración excesiva");
        //info11text.setContentDescription("Piel enrojecida, caliente y seca o sudoración excesiva");
        
        info12text.setText("Temperatura corporal muy alta");
        //info12text.setContentDescription("Temperatura corporal muy alta");
        
        info13text.setText("Confusión");
        //info13text.setContentDescription("Confusión");
        
        info14text.setText("Convulsiones");
        //info14text.setContentDescription("Convulsiones");
        
        info15text.setText("Desmayo");
        //info15text.setContentDescription("Desmayo");
        
        // row 2
        TextView info21text = (TextView) findViewById(R.id.info21text);
        TextView info22text = (TextView) findViewById(R.id.info22text);
        TextView info23text = (TextView) findViewById(R.id.info23text);
        TextView info24text = (TextView) findViewById(R.id.info24text);
        TextView info25text = (TextView) findViewById(R.id.info25text);
        TextView info26text = (TextView) findViewById(R.id.info26text);
        TextView info27text = (TextView) findViewById(R.id.info27text);
        TextView info28text = (TextView) findViewById(R.id.info28text);
        TextView info29text = (TextView) findViewById(R.id.info29text);
        TextView info210text = (TextView) findViewById(R.id.info210text);
        
        //Heat exhaustion
        info21text.setText("Piel fría y húmeda");
        //info21text.setContentDescription("Piel fría y húmeda");
        
        info22text.setText("Sudoración profusa");
        //info22text.setContentDescription("Sudoración profusa");
        
        info23text.setText("Dolor de cabeza");
        //info23text.setContentDescription("Dolor de cabeza");
        
        info24text.setText("Náuseas o vómitos");
        //info24text.setContentDescription("Náuseas o vómitos");
        
        info25text.setText("Mareo");
        //info25text.setContentDescription("Mareo");
        
        info26text.setText("Aturdimiento");
        //info26text.setContentDescription("Aturdimiento");
        
        info27text.setText("Debilidad");
        //info27text.setContentDescription("Debilidad");
        
        info28text.setText("Sed");   
        //info28text.setContentDescription("Sed");
        
        info29text.setText("Irritabilidad");
        //info29text.setContentDescription("Irritabilidad");
        
        info210text.setText("Pulso rápidas"); 
        //info210text.setContentDescription("Pulso rápidas");
         
         
        // row 4       
        TextView info41text = (TextView) findViewById(R.id.info41text);
        TextView info42text = (TextView) findViewById(R.id.info42text);
        TextView info43text = (TextView) findViewById(R.id.info43text);  
        
        //Heat cramps
        info41text.setText("Espasmos musculares");
        //info41text.setContentDescription("Espasmos musculares");
             
        info42text.setText("Dolor");
        //info42text.setContentDescription("Dolor");
        
        info43text.setText("Por lo general, en el abdomen, los brazos o las piernas"); 
        //info43text.setContentDescription("Por lo general, en el abdomen, los brazos o las piernas");
          
        // row 5
        TextView info51text = (TextView) findViewById(R.id.info51text);
        TextView info52text = (TextView) findViewById(R.id.info52text);
         
        //Heat rash
        info51text.setText("Pequeños grupos de ampollas en la piel");
        //info51text.setContentDescription("Pequeños grupos de ampollas en la piel");
        
        info52text.setText("Aparece a menudo en el cuello, parte superior del pecho, pliegues de la piel");
        //info52text.setContentDescription("Aparece a menudo en el cuello, parte superior del pecho, pliegues de la piel");
        
   
        // Info buttons
        Button	signs_button1 = (Button) findViewById(R.id.signs_button1);
        signs_button1.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent goMainMenu = new Intent(signsandsymptoms.this, firstaid.class);
			    startActivity(goMainMenu);  
			}
		});
        Button	signs_button2 = (Button) findViewById(R.id.signs_button2);
        signs_button2.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent goMainMenu = new Intent(signsandsymptoms.this, firstaid.class);
			    startActivity(goMainMenu);  
			}
		});

        Button	signs_button4 = (Button) findViewById(R.id.signs_button4);
        signs_button4.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent goMainMenu = new Intent(signsandsymptoms.this, firstaid.class);
			    startActivity(goMainMenu);  
			}
		});
        Button	signs_button5 = (Button) findViewById(R.id.signs_button5);
        signs_button5.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent goMainMenu = new Intent(signsandsymptoms.this, firstaid.class);
			    startActivity(goMainMenu);  
			}
		});
              
        
      //navaigation buttons
        Button home_button = (Button) findViewById(R.id.home_button);
        home_button.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) { 
        	   Intent goNext = new Intent(signsandsymptoms.this, HeatIndex.class);
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
    			 Intent goMainMenu = new Intent(signsandsymptoms.this, moreinfo.class);
    		     startActivity(goMainMenu);    			
    		}
    	});  
    }  
}
       
