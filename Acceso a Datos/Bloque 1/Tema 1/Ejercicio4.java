import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio4 {

    public static void main(String[] args) {

        String origen = "C:\\Users\\PC111\\Desktop\\2-DAM\\Acceso a Datos\\Bloque 1\\Tema 1\\foto4.png";
        String destino = "C:\\Users\\PC111\\Desktop\\2-DAM\\Acceso a Datos\\Bloque 1\\Tema 1\\foto_copia_ej4.jpg";

        int contadorBloques = 0;

        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origen));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destino))
        ) {
            
            byte[] buffer = new byte[1024];
            int bytesLeidos;

            while ((bytesLeidos = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesLeidos);

                contadorBloques++;
                System.out.println("Fin copia bloque " + contadorBloques);
            }
            
            bis.close();
            bos.close();
            System.out.println("Copia finalizada correctamente.");

        } catch (IOException e) {
            System.out.println("Error al copiar el fichero: " + e.getMessage());
        }
    }
}
