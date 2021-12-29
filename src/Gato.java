import java.util.Scanner;

public class Gato {

    String[] gato = {
            "0","1","2",
            "3","4","5",
            "6","7","8",};
    Scanner scanner = new Scanner(System.in);
    int opc, pos;
    String j1="X", j2="O", gan;
    boolean ganador, emp;

    public void menu(){
        System.out.println("Selecciona una opcion para jugar [1. Jugar - 2. Salir] ");
        opc = scanner.nextInt();
        if (opc == 1){
            while (!emp){
                System.out.println("");
                System.out.println("Selecciona un numero de entre el 0 al 8 para jugar en el tablero");
                imprimirTablero();
                System.out.println("");
                System.out.println("Jugador uno selecciona una posicion: ");
                pos = scanner.nextInt();
                gato[pos] = j1;
                ganador = ganador();
                imprimirTablero();
                System.out.println("");
                if (ganador==true){
                    gan = "J1";
                    break;
                }
                emp = checarEmpate();
                if (emp == true){
                    gan = "Empate";
                    break;
                }
                System.out.println("");
                System.out.println("Jugador dos selecciona una posicion");
                pos = scanner.nextInt();
                gato[pos] = j2;
                ganador = ganador();
                imprimirTablero();
                System.out.println("");
                if (ganador==true){
                    gan = "J2";
                    break;
                }
                emp = checarEmpate();
                if (emp == true){
                    gan = "Empate";
                    break;
                }
            }
            System.out.println(gan);

        }else{
            System.out.println("Gracias por jugar :D");
        }
    }

    public boolean ganador(){
        if (gato[0]=="X" && gato[1]=="X" && gato[2]=="X"||gato[0]=="O" && gato[1]=="O" && gato[2]=="O"){
            ganador = true;
        } else if (gato[3]=="X" && gato[4]=="X" && gato[5]=="X"||gato[3]=="O" && gato[4]=="O" && gato[5]=="O"){
            ganador = true;
        }else if (gato[6]=="X" && gato[7]=="X" && gato[8]=="X"||gato[6]=="Y" && gato[7]=="Y" && gato[8]=="Y"){
            ganador = true;
        }else if (gato[0]=="X" && gato[3]=="X" && gato[6]=="X"||gato[0]=="Y" && gato[3]=="Y" && gato[6]=="Y"){
            ganador = true;
        }
        else if (gato[1]=="X" && gato[4]=="X" && gato[7]=="X"||gato[1]=="Y" && gato[4]=="Y" && gato[7]=="Y"){
            ganador = true;
        }
        else if (gato[2]=="X" && gato[5]=="X" && gato[8]=="X"||gato[2]=="O" && gato[5]=="O" && gato[8]=="O"){
            ganador = true;
        }else if (gato[0]=="X" && gato[4]=="X" && gato[8]=="X"||gato[0]=="O" && gato[4]=="O" && gato[8]=="O"){
            ganador = true;
        }
        else if (gato[2]=="X" && gato[4]=="X" && gato[6]=="X"||gato[2]=="O" && gato[4]=="O" && gato[6]=="O"){
            ganador = true;
        }
        return ganador;
    }


    public boolean checarEmpate(){
        for (int i = 0; i < gato.length; i++) {
            if (gato[i].contains("0")||gato[i].contains("1")||gato[i].contains("2")
            ||gato[i].contains("3")||gato[i].contains("4")||gato[i].contains("5")||gato[i].contains("6")
            ||gato[i].contains("7")||gato[i].contains("8")){
                return false;
            }
        }
        return true;
    }

    public void imprimirTablero(){
        for (int i = 0; i < gato.length ; i++) {
            if (i == 3 || i==6 || i==9){
                System.out.println("");
                System.out.print(gato[i] + " ");
            }else {
                System.out.print(gato[i] + " ");
            }
        }
    }
}
