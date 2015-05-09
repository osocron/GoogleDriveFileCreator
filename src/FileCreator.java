import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by osocr_000 on 09/05/2015.
 */
public class FileCreator {

    public static void main(String args[]){
        generateReunionScramentalFiles();
        generateReunionObispadoFiles();
        generateAperturaDeSacerdocioFiles();
        generateConsejoDeBarrioFiles();
        generateComiteEjecutivoDeSacerdocioFiles();
    }


    private static void generateReunionScramentalFiles(){
        Path sourcePath = Paths.get("C:\\Users\\osocr_000\\Google Drive Araucarias\\Agendas\\Reunión sacramental\\Reunión Sacramental 2015-05-24.gdoc");
        Path destinyPath = null;
        List<Path> listaPaths = new ArrayList<Path>();
        for(int i = 6; i < 28; i++){
            String day = String.format("%02d",i);
            destinyPath = Paths.get("C:\\Users\\osocr_000\\Google Drive Araucarias\\Agendas\\Reunión sacramental\\Reunión Sacramental 2015-12-"+day+".gdoc");
            listaPaths.add(destinyPath);
            i = i + 6;
        }
        byte[] fileArray = new byte[0];
        try {
            fileArray = Files.readAllBytes(sourcePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("File not read");
        }
        final byte[] finalFileArray = fileArray;
        listaPaths.forEach((Path path) -> {
            try {
                Files.write(path, finalFileArray);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private static void generateReunionObispadoFiles(){
        Path sourcePath = Paths.get("C:\\Users\\osocr_000\\Google Drive Araucarias\\Agendas\\Reunión de obispado\\Reunión de obispado 2015-06-27.gdoc");
        Path destinyPath = null;
        List<Path> listaPaths = new ArrayList<Path>();
        for(int i = 5; i < 27; i++){
            String day = String.format("%02d",i);
            destinyPath = Paths.get("C:\\Users\\osocr_000\\Google Drive Araucarias\\Agendas\\Reunión de obispado\\Reunión de obispado 2015-12-"+day+".gdoc");
            listaPaths.add(destinyPath);
            i = i + 6;
        }
        byte[] fileArray = new byte[0];
        try {
            fileArray = Files.readAllBytes(sourcePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("File not read");
        }
        final byte[] finalFileArray = fileArray;
        listaPaths.forEach((Path path) -> {
            try {
                Files.write(path, finalFileArray);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private static void generateAperturaDeSacerdocioFiles(){
        Path sourcePath = Paths.get("C:\\Users\\osocr_000\\Google Drive Araucarias\\Agendas\\Apertura de sacerdocio\\Apertura de Sacerdocio 2015-05-10.gdoc");
        Path destinyPath = null;
        List<Path> listaPaths = new ArrayList<Path>();
        for(int i = 6; i < 28; i++){
            String day = String.format("%02d",i);
            destinyPath = Paths.get("C:\\Users\\osocr_000\\Google Drive Araucarias\\Agendas\\Apertura de sacerdocio\\Apertura de Sacerdocio 2015-12-"+day+".gdoc");
            listaPaths.add(destinyPath);
            i = i + 6;
        }
        byte[] fileArray = new byte[0];
        try {
            fileArray = Files.readAllBytes(sourcePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("File not read");
        }
        final byte[] finalFileArray = fileArray;
        listaPaths.forEach((Path path) -> {
            try {
                Files.write(path, finalFileArray);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private static void generateComiteEjecutivoDeSacerdocioFiles(){
        Path sourcePath = Paths.get("C:\\Users\\osocr_000\\Google Drive Araucarias\\Agendas\\Comité ejecutivo del sacerdocio de barrio\\Comité Ejecutivo 2015-05-10.gdoc");
        Path destinyPath = null;
        List<Path> listaPaths = new ArrayList<Path>();
        for(int i = 6; i < 28; i++){
            String day = String.format("%02d",i);
            destinyPath = Paths.get("C:\\Users\\osocr_000\\Google Drive Araucarias\\Agendas\\Comité ejecutivo del sacerdocio de barrio\\Comité Ejecutivo 2015-12-"+day+".gdoc");
            listaPaths.add(destinyPath);
            i = i + 6;
        }
        byte[] fileArray = new byte[0];
        try {
            fileArray = Files.readAllBytes(sourcePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("File not read");
        }
        final byte[] finalFileArray = fileArray;
        listaPaths.forEach((Path path) -> {
            try {
                Files.write(path, finalFileArray);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private static void generateConsejoDeBarrioFiles(){
        Path sourcePath = Paths.get("C:\\Users\\osocr_000\\Google Drive Araucarias\\Agendas\\Consejo de barrio\\Consejo de Barrio 2015-05-10.gdoc");
        Path destinyPath = null;
        List<Path> listaPaths = new ArrayList<Path>();
        for(int i = 6; i < 28; i++){
            String day = String.format("%02d",i);
            destinyPath = Paths.get("C:\\Users\\osocr_000\\Google Drive Araucarias\\Agendas\\Consejo de barrio\\Consejo de Barrio 2015-12-"+day+".gdoc");
            listaPaths.add(destinyPath);
            i = i + 6;
        }
        byte[] fileArray = new byte[0];
        try {
            fileArray = Files.readAllBytes(sourcePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("File not read");
        }
        final byte[] finalFileArray = fileArray;
        listaPaths.forEach((Path path) -> {
            try {
                Files.write(path, finalFileArray);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}
