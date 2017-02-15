package com.example.dejan.currencyexchangerate_v004;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Currency extends AppCompatActivity {
    TextView TextHNB;


    /*static String getLineFromStream(java.io.InputStream is, int linePos){

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;
        try {
            for (int i = 0; i <= linePos; i++) {
                line = br.readLine();
            }
        } catch (IOException e){
            // Handle exception here (or you can throw)
        }

        return line;
    }
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        TextHNB = (TextView) findViewById(R.id.TextHNB);

        try {

            TextHNB.setText(ReadFile("textHNB.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        try {
            InputStream inputStream = getAssets().open("textHNB.txt");
            TextHNB.setText(getLineFromStream(inputStream, 749));
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    public static String ReadFile(String path) throws IOException {
        String line = null;

        FileInputStream fileInputStream = null;
        try {

            fileInputStream = new FileInputStream(new File(path));
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder stringBuilder = new StringBuilder();

            while ( (line = bufferedReader.readLine()) != null )
            {
                stringBuilder.append(line + System.getProperty("line.separator"));
            }
            fileInputStream.close();
            line = stringBuilder.toString();

            bufferedReader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return line;
    }

}

