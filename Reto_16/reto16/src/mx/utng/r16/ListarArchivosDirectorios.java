package mx.utng.r16;

import java.io.File;

public class ListarArchivosDirectorios {
    public static void main(String[] args) {
        String[] rutas = {
            "C:\\Users\\Public\\temp\\archivos",
            "C:\\Users\\Public\\temp\\cursos",
            "C:\\Users\\Public\\temp\\cursos\\utng\\bases de datos",
            "C:\\Users\\Public\\temp\\cursos\\utng\\java",
            "C:\\Users\\Public\\temp\\cursos\\utng\\python",
            "C:\\Users\\Public\\temp\\cursos\\otros",
            "C:\\Users\\Public\\temp\\programas"
        };

        for (String ruta : rutas) {
            File carpetaBase = new File(ruta);
            listarArchivosDirectorios(carpetaBase, 0); 
        }
    }

    public static void listarArchivosDirectorios(File carpeta, int nivel) {
        File[] archivosYCarpetas = carpeta.listFiles();

        if (archivosYCarpetas != null) {
            for (File archivoOCarpeta : archivosYCarpetas) {
                String marca = archivoOCarpeta.isDirectory() ? "D" : "A";
                String nombre = archivoOCarpeta.getName();
                String guiones = "-".repeat(nivel); 

                System.out.println(guiones + marca + " " + nombre);

                if (archivoOCarpeta.isDirectory()) {
                    listarArchivosDirectorios(archivoOCarpeta, nivel + 1); 
                }
            }
        } else {
            System.out.println("No se pudo acceder a la carpeta: " + carpeta.getPath());
        }
    }
}

