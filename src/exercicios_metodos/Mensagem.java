package exercicios_metodos;

import javax.crypto.spec.PSource;

public class Mensagem {

    public static void obterMensagem(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                mensagemBoaNoite();
                break;
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemVaiDormir();
                break;
            default:
                System.out.println("hora inválida.");
                break;

        }
    }

    private static void mensagemBomDia() {
        System.out.println("Bom Dia");
    }
    private static void mensagemBoaTarde() {
        System.out.println("Boa Tarde");
    }
    private static void mensagemBoaNoite() {
        System.out.println("Boa Noite");
    }
    private static void mensagemVaiDormir() {
        System.out.println("Vai Dormir");
    }

}

