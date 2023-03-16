import javax.swing.*;

public class MediaEscolar {
    public static void main(String[] args){

        String nome;
        int idade;
        float n1;
        float n2;
        float n3;
        float n4;
        float media;

        nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
        idade = Integer.parseInt( JOptionPane.showInputDialog("Insira a idade do aluno: "));
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a primeira nota do aluno: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a segunda nota do aluno: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Insira a terceira nota do aluno: "));
        n4 = Float.parseFloat(JOptionPane.showInputDialog("Insira a quarta nota do aluno: "));

        media = (n1 + n2 + n3 + n4) / 4;

        if(media > 7){
            System.out.printf("O aluno %s esta aprovado! ", nome);
        }
        else if(media >= 5 && media < 7) {
            System.out.printf("O aluno %s esta em recuperacao! ", nome);
        }
        else{
            System.out.printf("O aluno %s esta reprovado! ", nome);
        }
    }
}
