import java.util.ArrayList;

public class calculaDVCPF {
    public static void main(String[] Args) {
        // CPF gerador virtualmente, ficticio
        int[] cpfNoveDigitosArr = {4,1,5,4,0,7,4,6,0};
        ArrayList cpfNoveDigitos =  new ArrayList<>();
        ArrayList cpfComDV =  new ArrayList<>();
        for (int i = 0; i < cpfNoveDigitosArr.length; i++){
            cpfNoveDigitos.add(cpfNoveDigitosArr[i]);
        }
        cpfComDV = calculaDV1CPF(cpfNoveDigitos);
        cpfComDV = calculaDV2CPF(cpfComDV);
        System.out.println(cpfComDV);
    }

    public static ArrayList calculaDV1CPF(ArrayList cpfNoveDigitos) {
        ArrayList cpfComDV1 = cpfNoveDigitos;

        int acumulador = 0;
        int peso = 10;
        int auxiliar = 0;
        Integer dv1 = null;

        for (int i = 0; i<cpfNoveDigitos.size(); i++) {
            auxiliar = ((int) cpfNoveDigitos.get(i)) * peso;
            acumulador += auxiliar;
            peso--;
        }

        acumulador = acumulador % 11;
        dv1 = 11 - acumulador ;
        cpfComDV1.add(dv1);

        return cpfComDV1;
    }

    public static ArrayList calculaDV2CPF(ArrayList cpfDezDigitos) {
        ArrayList cpfComDV2 = cpfDezDigitos;
        int acumulador = 0;
        int peso = 11;
        int auxiliar = 0;
        Integer dv2 = null;

        for (int i = 0; i<cpfDezDigitos.size(); i++) {
            auxiliar = ((int) cpfDezDigitos.get(i)) * peso;
            acumulador += auxiliar;
            peso--;
        }

        acumulador = acumulador % 11;
        dv2 = 11 - acumulador;
        cpfComDV2.add(dv2);
        return cpfComDV2;
    }

}
