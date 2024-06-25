/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Random;
import javax.swing.JOptionPane;
//para arreglos dinamicos
import java.util.ArrayList;
//para la generacion del pdf con apachepdfbox
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import java.io.FileInputStream;
//jfilechooser y File para mostrarle al usuario un diálogo de selección de archivos en el cual pueda seleccionar el directorio en el que quiere guardar el pdf generado (si decidio generarlo)
import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.ImageIcon;


/**
 *
 * @author Milton Rodriguez
 */
public class Enigma {
    
    
  
    public char[] abecedario={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','+','-','*','/','=','¿','?','¡','!',',','.',' ','(',')','1','2','3','4','5','6','7','8','9','0'};
    public char[] abecedario2={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z','+','-','*','/','=','¿','?','¡','!',',','.',' ','(',')','1','2','3','4','5','6','7','8','9','0'};
    public int[] clave1={943,183,806,766,879,290,395,551,257,594,100,215,668,472,903,797,957,917,471,513,550,546,324,875,293,258,558,465,618,217,785,543,816,948,317,362,318,970,940,899,407,882,695,498,988,209,729,254,642,139,719};
    public int[]clave2={760,383,356,800,801,665,349,762,248,936,681,511,769,152,442,918,651,160,643,745,195,898,266,774,281,510,507,598,897,206,926,400,355,326,270,337,268,343,601,265,496,817,189,346,576,319,486,369,749,392,556};
    public int[]clave3={194,304,636,921,714,983,575,922,564,761,143,832,909,845,380,880,335,873,433,895,196,181,790,734,930,344,449,941,735,891,836,291,591,242,165,198,696,476,450,896,184,113,203,789,684,256,228,985,308,956,641};
    public int[]clave4={540,150,640,157,913,776,271,703,351,532,892,549,170,470,679,805,741,878,123,220,904,967,691,263,451,844,803,935,443,661,338,646,628,322,329,932,435,313,166,612,592,811,753,459,439,398,613,559,298,888,874};
    public int[]clave5={384,367,721,711,915,724,793,786,788,658,523,341,610,678,440,689,423,283,900,289,638,976,494,693,463,378,825,947,945,107,822,441,858,680,708,375,611,193,852,914,416,172,860,114,394,902,525,197,630,396,727};
    public int[]clave6={883,497,589,739,529,133,136,115,765,949,358,835,813,216,535,713,712,978,587,773,597,176,954,339,893,783,226,414,146,588,102,843,106,840,831,333,743,415,173,870,227,284,444,862,205,361,231,330,210,142,720};
    public int[]clave7={584,771,677,211,846,446,593,756,795,417,527,637,933,539,261,185,222,109,410,401,518,156,570,633,177,345,547,962,671,553,698,411,491,974,675,145,864,391,552,905,709,623,521,942,237,955,388,466,657,578,847};
    public int[]clave8={868,164,586,253,481,292,871,998,663,819,548,302,422,747,506,726,127,911,585,426,434,916,718,233,500,122,569,746,953,376,537,934,619,200,779,134,755,620,409,208,522,221,504,605,946,923,694,740,307,669,566};
    public int[] clave9={842,485,334,505,342,105,381,865,168,908,320,340,748,617,855,744,662,660,554,647,424,245,697,374,545,457,910,782,686,758,750,989,890,692,560,332,305,191,247,190,477,192,430,239,103,772,996,674,259,460,635};
    public int[]clave10={230,648,421,929,162,404,373,408,993,286,534,725,250,818,244,204,826,366,814,483,144,131,336,530,710,959,328,354,810,791,397,608,877,616,232,876,130,863,963,158,484,175,939,428,482,389,438,809,968,279,331};
    public int[]clave11={924,285,390,649,799,802,456,866,907,262,848,990,763,920,116,872,851,604,432,276,621,479,473,565,249,315,622,615,455,467,770,182,627,555,236,377,861,632,567,137,828,117,980,260,350,212,987,149,454,526,468};
    public int[]clave12={742,501,264,403,827,280,723,359,119,690,856,385,683,950,794,971,357,427,186,823,452,572,964,402,297,768,316,110,857,202,516,101,517,975,321,830,544,602,787,702,792,199,887,829,174,979,938,886,673,294,607};
    public int[]clave13={833,508,225,562,820,154,135,781,626,634,699,188,531,541,849,464,574,240,282,881,798,595,599,728,520,495,458,218,927,252,733,121,201,606,348,965,824,757,309,582,841,600,151,834,837,645,722,780,255,352,652};
    public int[]clave14={128,704,730,639,474,129,275,603,420,659,487,688,224,804,368,966,234,251,353,629,751,300,609,323,928,475,437,502,161,138,653,453,235,624,736,982,153,399,796,214,159,972,969,754,715,984,436,655,812,364,469};
    public int[]clave15={731,850,764,124,738,425,579,952,493,778,919,999,889,108,347,666,687,568,140,311,664,815,405,854,207,310,931,387,667,514,462,488,992,393,125,413,717,536,379,246,431,303,187,269,447,141,571,272,169,167,503};
    public int[]clave16={519,670,492,118,524,445,676,327,418,528,577,155,112,223,243,363,821,644,808,561,512,461,596,994,312,752,429,126,960,278,360,937,581,775,706,120,973,509,707,299,542,180,419,132,406,838,732,287,656,306,111};
    public ArrayList<String> lista = new ArrayList<String>();
    private ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fotoj.png"));//icono para los joptionpane
    
   
    
    public void cifrar(){
        Random dado = new Random();
        //dado.setSeed(System.currentTimeMillis());
        int num=dado.nextInt(16)+1;
        String texto="";
        String texto2="";
        
        
        String entrada=JOptionPane.showInputDialog(null,"Ingrese texto a cifrar: ","***Cifrado***",JOptionPane.QUESTION_MESSAGE);
        
        if(entrada==null){
            menu();
            return;//para detener la ejecucion de cifrar() y devolver a menu()
        }
        
        
        while(entrada.length()==0){
            JOptionPane.showMessageDialog(null,"Asegurese de haber escrito el texto correctamente.","Error",JOptionPane.ERROR_MESSAGE,icon);
            cifrar();
        }
        
        
        if(num==1){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave1[j];
                    }
                }
            }
            texto2="785625";
        }
        if(num==2){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave2[j];
                    }
                }
            }
            texto2="524162";
        }
        if(num==3){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave3[j];
                    }
                }
            }
            texto2="482468";
        }
        if(num==4){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave4[j];
                    }
                }
            }
            texto2="584635";
        }
        if(num==5){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave5[j];
                    }
                }
            }
            texto2="253845";
        }
        if(num==6){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave6[j];
                    }
                }
            }
            texto2="295478";
        }
        if(num==7){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave7[j];
                    }
                }
            }
            texto2="112658";
        }
        if(num==8){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave8[j];
                    }
                }
            }
            texto2="324928";
        }
        if(num==9){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave9[j];
                    }
                }
            }
            texto2="899723";
        }
        if(num==10){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave10[j];
                    }
                }
            }
            texto2="897425";
        }
        if(num==11){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave11[j];
                    }
                }
            }
            texto2="899214";
        }
        if(num==12){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave12[j];
                    }
                }
            }
            texto2="899763";
        }
        if(num==13){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave13[j];
                    }
                }
            }
            texto2="899702";
        }
        if(num==14){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave14[j];
                    }
                }
            }
            texto2="755401";
        }
        if(num==15){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave15[j];
                    }
                }
            }
            texto2="305204";
        }
        if(num==16){//trabaja con la combinacion 1
            for(int i=0;i<entrada.length();i++){
                for(int j=0;j<=50;j++){
                    if(entrada.charAt(i)==abecedario[j]||entrada.charAt(i)==abecedario2[j]){
                        texto+=clave16[j];
                    }
                }
            }
            texto2="004726";
        }
        
        
        caja cajadecifrado = new caja(null,true);
        cajadecifrado.setTextfCifrado(texto);
        cajadecifrado.setTextfClave(texto2);
        cajadecifrado.pack(); // Empaqueta el contenido para establecer el tamaño de la ventana
        cajadecifrado.setLocationRelativeTo(null); // Centra el diálogo en la pantalla
        cajadecifrado.setVisible(true);
        //JOptionPane.showMessageDialog(null,texto+"\n"+texto2+"\nConservela, solo con esta clave podra descifrar el mensaje.","***Cifrado***",JOptionPane.INFORMATION_MESSAGE);
        lista.add("***CIFRADO***");
        lista.add("Texto: "+entrada+" |||Cifrado: "+texto+" |||Clave: "+texto2+" /**|||||**/ ");
        menu();
        
        
    }
    
    public void generarPdf(){//el usuario presiona el boton generar pdf
        if(lista.isEmpty()){//si la lista esta vacia, osea no ha cifrado ni descifrado nada, es la primera vez que abre el menu y ya le da a generar pdf.
            JOptionPane.showMessageDialog(null,"Cifre o descifre al menos una vez para generar su PDF.","Error",JOptionPane.ERROR_MESSAGE,icon);
            menu();
            return;
        }
        String nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre: ","***GENERAR PDF***",JOptionPane.QUESTION_MESSAGE);
        if(nombre==null){
            menu();
            return;
        }
        if(nombre.length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese un nombre para personalizar su PDF","Error",JOptionPane.ERROR_MESSAGE,icon);
            generarPdf();
        }
        ArrayList<String> cifrado = new ArrayList<String>();
        ArrayList<String> descifrado = new ArrayList<String>();
        //String[]cifrado={};
        //String[]descifrado={};
        
        for(int i=0;i<lista.size();i++){//guardar los textos de cifrado en arreglo cifrado[], para imprimir en el pdf despues
            if(lista.get(i).equals("***CIFRADO***")){
                cifrado.add(lista.get(i+1));
                
            }
        }
        
        for(int i=0;i<lista.size();i++){//lo mismo con los textos de descifrado
            if(lista.get(i).equals("***DESCIFRADO***")){
                descifrado.add(lista.get(i+1));
                
            }
        }
        
        String[] cifrado1=cifrado.toArray(new String[0]);//convierto el arreglo string dinamico "cifrado" a un arreglo convencional con el metodo .toArray(new String[0]) y lo guardo en "cifrado1"
        String[] descifrado1=descifrado.toArray(new String[0]);
        
        String textopdfCifrado="***CIFRADO***: "+String.join("",cifrado1);
        String textopdfDescifrado="***DESCIFRADO***: "+String.join("",descifrado1);
        
        PDDocument document = new PDDocument();//creo el documento por fuera del try para luego poder acceder a él en la clausula finally y cerrarlo. Si no, se queda como variable local del try y tendria alcance limitado, y necesito acceder a el desde el bloque finally para que, se produzca o no una excepcion dentro del try, cerrar el documento en el finally. Necesito ponerlo aqui para poder cerrar el documento en la clausula finally.
        try {
            // aquí iría todo el código que genera el PDF
            //PDDocument document = new PDDocument();
            PDPage page = new PDPage();
            // Agregar la página al documento
            document.addPage(page);

            // Crear un objeto PDPageContentStream para escribir en la página
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 50);
            contentStream.beginText();
            contentStream.newLineAtOffset(50, 400);
            contentStream.showText("Claves");
            contentStream.newLineAtOffset(0, -40);
            contentStream.showText("enigma");
            contentStream.newLineAtOffset(0, -40);
            contentStream.showText("de");
            contentStream.newLineAtOffset(0, -40);
            contentStream.showText(nombre);
            
            
            contentStream.endText();
            contentStream.close();
            page = new PDPage();
            document.addPage(page);
            contentStream = new PDPageContentStream(document, page);
            
            
            contentStream.setFont(PDType1Font.COURIER_BOLD, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(50, 700);
            //contentStream.showText(textopdfCifrado);
            //contentStream.newLineAtOffset(0, -20);
            //contentStream.showText(textopdfDescifrado);
            //necesito que si llega a 70 caracteres el texto, de un salto de linea
            //arreglodecaracteres.length/70 = dimension del arreglo resultante
            //System.out.println(textopdfCifrado);
            String Cifr="";
            int cont =0;
            for(int i=0;i<textopdfCifrado.length();i++){
                //cuando i=70 (y 70x2 y 70x3) debe saltar de linea y escribir ahi las siguientes caracteres
                //que en cada pag se escriban solo 34 lineas de texto y despues cree otra
 
                if((i+1)%71==0){//va de 70 en 70. i+1 multiplo de 71 para cada 70 haga algo.
                    
                    Cifr+=String.valueOf(textopdfCifrado.charAt(i));
                    contentStream.showText(Cifr);
                    cont++;
                    contentStream.newLineAtOffset(0, -20);
                    Cifr="";
                    
                    
                }else{
                    Cifr+=String.valueOf(textopdfCifrado.charAt(i));
                }
                
                if(i==(textopdfCifrado.length()-1)&&Cifr.length()!=0){//si se acabo el for y todavia hay caracteres por escribir, escribalos
                    contentStream.showText(Cifr);
                    cont++;
                    contentStream.newLineAtOffset(0, -20);
                    Cifr="";
                }
                
                if(cont%34==0&&cont!=0){//va de 34 en 34 escrituras de texto creando nuevas pags. Cada 34 escrituras con .showText crea nueva pagina. 
                    
                    
                    contentStream.endText();
                    contentStream.close();
                    page = new PDPage();
                    document.addPage(page);
                    contentStream = new PDPageContentStream(document, page);
                    contentStream.setFont(PDType1Font.COURIER_BOLD, 12);
                    contentStream.beginText();
                    contentStream.newLineAtOffset(50, 700);
                    cont=0;//cuando crea la nueva pagina reinicio cont para que empiece a contar desde cero las escrituras, no vuelve a crear otra pagina sino hasta que cont vuelva a valer 34 lo que indica que la pagina actual ya se lleno y debo saltar a la siguiente.
                }
                
            }
            
            //Cifr sale de arriba valiendo "", asi que no necesito reiniciarlo aca y puedo usarlo de nuevo para el for de textopdfDescifrado.
            //cierro el contentStream anterior porque salto a la siguiente pagina (independientemente de si sobro espacio o no en la anterior) para imprimir textopdfDescifrado
            contentStream.endText();
            contentStream.close();
            page = new PDPage();
            document.addPage(page);
            contentStream = new PDPageContentStream(document, page);
            contentStream.setFont(PDType1Font.COURIER_BOLD, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(50, 700);
            
            cont =0;
            for(int i=0;i<textopdfDescifrado.length();i++){
                //cuando i=70 (y 70x2 y 70x3) debe saltar de linea y escribir ahi las siguientes caracteres
                //que en cada pag se escriban solo 34 lineas de texto y despues cree otra
 
                if((i+1)%71==0){//va de 70 en 70. i+1 multiplo de 71 para cada 70 haga algo.
                    
                    Cifr+=String.valueOf(textopdfDescifrado.charAt(i));
                    contentStream.showText(Cifr);
                    cont++;
                    contentStream.newLineAtOffset(0, -20);
                    Cifr="";
                    
                    
                }else{
                    Cifr+=String.valueOf(textopdfDescifrado.charAt(i));
                }
                
                if(i==(textopdfDescifrado.length()-1)&&Cifr.length()!=0){//si se acabo el for y todavia hay caracteres por escribir, escribalos
                    contentStream.showText(Cifr);
                    cont++;
                    contentStream.newLineAtOffset(0, -20);
                    Cifr="";
                }
                
                if(cont%34==0&&cont!=0){//va de 34 en 34 escrituras de texto creando nuevas pags. Cada 34 escrituras con .showText crea nueva pagina. 
                    
                    
                    contentStream.endText();
                    contentStream.close();
                    page = new PDPage();
                    document.addPage(page);
                    contentStream = new PDPageContentStream(document, page);
                    contentStream.setFont(PDType1Font.COURIER_BOLD, 12);
                    contentStream.beginText();
                    contentStream.newLineAtOffset(50, 700);
                    cont=0;//cuando crea la nueva pagina reinicio cont para que empiece a contar desde cero las escrituras, no vuelve a crear otra pagina sino hasta que cont vuelva a valer 34 lo que indica que la pagina actual ya se lleno y debo saltar a la siguiente.
                }
                
            }
            
            
            
            
            
            
            
            
            contentStream.endText();
            contentStream.close();
            
            
            //le muestro un dialogo de seleccion de archivos al usuario usando las librerias Jfilechooser y File para que seleccione donde quiere guardar el pdf.
            
            // Crear un objeto JFileChooser
            JFileChooser fileChooser = new JFileChooser();

            // Establecer el directorio inicial para mostrar en el diálogo de selección de archivos
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

            // Mostrar el diálogo de selección de archivos para que el usuario seleccione un directorio
            int result = fileChooser.showSaveDialog(null);

            // Si el usuario hace clic en "Guardar" en el diálogo de selección de archivos
            if (result == JFileChooser.APPROVE_OPTION) {
                // Obtener el archivo seleccionado
                File selectedFile = fileChooser.getSelectedFile();
                // Obtener la ruta del archivo seleccionado
                String filePath = selectedFile.getAbsolutePath();

                // Establecer la ruta de guardado del PDF
                document.save(filePath + ".pdf");
            }
                
            
            // Guardar el documento
            //document.save("misclavesenigma.pdf");

            // Cerrar el documento
            //document.close();
            
            
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al generar el PDF. Intentelo despues.","Error",JOptionPane.ERROR_MESSAGE);
        }finally{
            if (document != null) {//antes de cerrar document verifico su nulidad (aunque no creo que pueda salir nulo del try) ya que, de ser nulo, al acceder a uno de sus metodos (.close()) lanzaria la excepcion NullPointerException, asi que para no agregar otro catch hago el if.
                try {
                    document.close();
                    //System.out.println("el documento se cerro");
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al generar el PDF. Intentelo despues.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        menu();
        
    }
    
    
    
    public void descifrar(){
        String entrada=JOptionPane.showInputDialog(null,"Ingrese texto a descifrar: ","***Descifrado***",JOptionPane.QUESTION_MESSAGE);
        //int n=entrada.length()/3;//numero de caracteres que debe tener el texto resultante, si la clave ingresada es la correcta.;
        if(entrada==null){
            menu();
            return;//para detener la ejecucion de descifrar() y devolver a menu() si le dio a cancel
        }
        
        if(entrada.length()==0||entrada.matches("[a-zA-Z]+")){//si entrada esta vacia o ingreso solo letras.
            JOptionPane.showMessageDialog(null,"Asegurese de haber escrito el texto cifrado correctamente.","Error",JOptionPane.ERROR_MESSAGE,icon);
            descifrar();
        }
        
        String entrada_temp="";//aqui concatenare todo lo de "entrada" que sea numeros, para que solo queden los numeros y quitar cualquier letra o espacio en blanco que haya puesto por error. Luego reemplazo entrada por el valor que salga de este str.
        for(int i=0;i<entrada.length();i++){
            if(String.valueOf(entrada.charAt(i)).equals("1")||String.valueOf(entrada.charAt(i)).equals("2")||String.valueOf(entrada.charAt(i)).equals("3")||String.valueOf(entrada.charAt(i)).equals("4")||String.valueOf(entrada.charAt(i)).equals("5")||String.valueOf(entrada.charAt(i)).equals("6")||String.valueOf(entrada.charAt(i)).equals("7")||String.valueOf(entrada.charAt(i)).equals("8")||String.valueOf(entrada.charAt(i)).equals("9")||String.valueOf(entrada.charAt(i)).equals("0")){
                entrada_temp+=String.valueOf(entrada.charAt(i));
            }
        }
        
        entrada=entrada_temp;
        if(entrada.equals("")){//si en entrada no hay nada es porque no concateno nada entrada_temp, osea que no ingreso numeros
            JOptionPane.showMessageDialog(null,"Asegurese de haber escrito el texto cifrado correctamente.","Error",JOptionPane.ERROR_MESSAGE,icon);
            descifrar();
        }
        
        if(entrada.length()%3!=0){//si entrada no es multiplo de 3 (osea, si el numero de numeros que hay en entrada no es multiplo de 3)
            JOptionPane.showMessageDialog(null,"Asegurese de haber escrito el texto cifrado correctamente.","Error",JOptionPane.ERROR_MESSAGE,icon);
            descifrar();
        }
        
        String entrada2=JOptionPane.showInputDialog(null,"Ingrese clave: ","***Descifrado***",JOptionPane.QUESTION_MESSAGE);
        if(entrada2==null){
            menu();
            return;
        }
        
        String entrada2_temp="";
        
        for(int i=0;i<entrada2.length();i++){
            if(String.valueOf(entrada2.charAt(i)).equals("1")||String.valueOf(entrada2.charAt(i)).equals("2")||String.valueOf(entrada2.charAt(i)).equals("3")||String.valueOf(entrada2.charAt(i)).equals("4")||String.valueOf(entrada2.charAt(i)).equals("5")||String.valueOf(entrada2.charAt(i)).equals("6")||String.valueOf(entrada2.charAt(i)).equals("7")||String.valueOf(entrada2.charAt(i)).equals("8")||String.valueOf(entrada2.charAt(i)).equals("9")||String.valueOf(entrada2.charAt(i)).equals("0")){
                entrada2_temp+=String.valueOf(entrada2.charAt(i));
            }
        }
        
        entrada2=entrada2_temp;
        
        while(!entrada2.equals("785625")&&!entrada2.equals("524162")&&!entrada2.equals("482468")&&!entrada2.equals("584635")&&!entrada2.equals("253845")&&!entrada2.equals("295478")&&!entrada2.equals("112658")&&!entrada2.equals("324928")&&!entrada2.equals("899723")&&!entrada2.equals("897425")&&!entrada2.equals("899214")&&!entrada2.equals("899763")&&!entrada2.equals("899702")&&!entrada2.equals("755401")&&!entrada2.equals("305204")&&!entrada2.equals("004726")){
            JOptionPane.showMessageDialog(null,"Asegurese de haber escrito la clave correctamente","Error",JOptionPane.ERROR_MESSAGE,icon);
            entrada2=JOptionPane.showInputDialog(null,"Ingrese clave: ","***Descifrado***",JOptionPane.QUESTION_MESSAGE);
            if(entrada2==null){
                menu();
                return;
            }
            entrada2_temp="";
        
            for(int i=0;i<entrada2.length();i++){
                if(String.valueOf(entrada2.charAt(i)).equals("1")||String.valueOf(entrada2.charAt(i)).equals("2")||String.valueOf(entrada2.charAt(i)).equals("3")||String.valueOf(entrada2.charAt(i)).equals("4")||String.valueOf(entrada2.charAt(i)).equals("5")||String.valueOf(entrada2.charAt(i)).equals("6")||String.valueOf(entrada2.charAt(i)).equals("7")||String.valueOf(entrada2.charAt(i)).equals("8")||String.valueOf(entrada2.charAt(i)).equals("9")||String.valueOf(entrada2.charAt(i)).equals("0")){
                    entrada2_temp+=String.valueOf(entrada2.charAt(i));
                }
            }
        
            entrada2=entrada2_temp;
        }
        
        String texto="";
        
        
        if(entrada2.equals("785625")){//clave 1
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave1[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("524162")){//clave 2
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave2[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("482468")){//clave 3
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave3[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("584635")){//clave 4
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave4[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("253845")){//clave 5
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave5[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("295478")){//clave 6
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave6[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("112658")){//clave 7
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave7[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("324928")){//clave 8
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave8[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("899723")){//clave 9
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave9[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("897425")){//clave 10
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave10[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("899214")){//clave 11
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave11[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("899763")){//clave 12
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave12[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("899702")){//clave 13
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave13[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("755401")){//clave 14
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave14[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("305204")){//clave 15
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave15[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        if(entrada2.equals("004726")){//clave 16
            for(int i=0;i<entrada.length();i+=3){
                for(int j=0;j<=50;j++){
                    if((String.valueOf(entrada.charAt(i))+String.valueOf(entrada.charAt(i+1))+String.valueOf(entrada.charAt(i+2))).equals(Integer.toString(clave16[j]))){
                        texto+=abecedario[j];
                    }
                }
            }
        }
        
        
        
        if(texto==""){
            JOptionPane.showMessageDialog(null,"Clave incorrecta.","***Descifrado***",JOptionPane.ERROR_MESSAGE,icon);
            descifrar();
        }else{
            caja2 cajadedescifrado = new caja2(null,true);
            cajadedescifrado.setTextfDescifrado(texto);
            cajadedescifrado.pack(); // Empaqueta el contenido para establecer el tamaño de la ventana
            cajadedescifrado.setLocationRelativeTo(null); // Centra el diálogo en la pantalla
            cajadedescifrado.setVisible(true);
            lista.add("***DESCIFRADO***");
            lista.add("Cifrado: "+entrada+" |||Clave: "+entrada2+" |||Descifrado: "+texto+" /**|||||**/ ");
            menu();
        }
        
        
        
        
        
    }
    
    public void menu(){
        String[]opciones={"Cifrar","Descifrar","Generar PDF","Vaciar PDF","Salir"};
        int resp=JOptionPane.showOptionDialog(null,"Elija","***Bienvenido a la maquina enigma***",0,JOptionPane.PLAIN_MESSAGE,icon,opciones,null);
        if(resp==0){
            cifrar();
        }else{
            if(resp==1){
                descifrar();
            }
            if(resp==2){
                generarPdf();
            }
            if(resp==3){
                caja3 cajaOkCancel = new caja3(null,true);
                cajaOkCancel.pack(); // Empaqueta el contenido para establecer el tamaño de la ventana
                cajaOkCancel.setLocationRelativeTo(null); // Centra el diálogo en la pantalla
                cajaOkCancel.setVisible(true);//lo hago visible
                if(cajaOkCancel.getReturnStatus()==1){//si le da a OK, devuelve RET_OK que es valor 1, sino, RET_CANCEL que es valor 0
                    lista.clear();//elimina todos los elementos del arrayList dinamico lista
                    menu();
                }else{
                    menu();
                }
            }
            if(resp==4){
                System.exit(0);
            }
        }
        
        
    }
    
    
    
    public static void main(String[] args){       
        Enigma enigma = new Enigma(); 
        enigma.menu();     
            
    }
    
    
    
}


