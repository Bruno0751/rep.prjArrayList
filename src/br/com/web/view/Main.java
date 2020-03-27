//Project Name: ProArrayList
package br.com.web.view;
import br.com.web.model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 14/03/2020 - 12:20
 * @version 1
 */
public class Main {
   
    public static void main(String[] args) {
        
        Pessoa objPessoa = new Pessoa();
        ArrayList<Pessoa> a = objPessoa.getListaDePesoas();
        do{
            try{
                objPessoa.setOp(Byte.parseByte(JOptionPane.showInputDialog(
                        "Escolha Uma Opção \n"
                        + "0 - Sair \n"
                        + "1 - Cadastrar Pessoas \n"
                        + "2 - Mostrar Pessoas Cadastradas")));
                switch(objPessoa.getOp()){
                    case 0:
                        JOptionPane.showMessageDialog(null, "Sistema Encerrado");
                        System.exit(0);
                        break;
                    case 1:   
                        objPessoa.setNome(JOptionPane.showInputDialog(
                                "Digite o Nome Completo"));    
                        
                        objPessoa.setIdade(Byte.parseByte(
                                JOptionPane.showInputDialog("Digite a Idade")));
                        
                        objPessoa.setCpf(JOptionPane.showInputDialog(
                                "Digite o CPF"));
                        
                        objPessoa.setRg(JOptionPane.showInputDialog(
                                "Digite o RG"));
                        
                        objPessoa.setPeso(Float.parseFloat(
                                JOptionPane.showInputDialog("Digite o Peso")));
                        
                        objPessoa.setAltura(Float.parseFloat(
                                JOptionPane.showInputDialog("Digite a Altura")));
                        
                        objPessoa.setCep(JOptionPane.showInputDialog(
                                "Digite o CEP"));
                        
                        objPessoa.setEndereco(JOptionPane.showInputDialog(
                                "Digite o Endereço"));
                        
                        objPessoa.setComplemento(Long.parseLong(
                                JOptionPane.showInputDialog(
                                        "Digite o Complemento")));
                        
                        a.add(objPessoa);
                        break;
                    case 2:
                        if (a.isEmpty()){
                            JOptionPane.showMessageDialog(null, 
                                    "A Lista Esta Vazia");
                        }else{
                            System.out.println(objPessoa.mostrarListaDePessoas());
                        }                           
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                        break;
                }
       
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "ERRO \n"
                        + "tipo: " + erro.getMessage(), "ERRO", 
                        JOptionPane.ERROR_MESSAGE);
            }finally{
                objPessoa.setErro(objPessoa.getF());
                JOptionPane.showMessageDialog(null, "Tente Novamente", "ERRO", 
                        JOptionPane.WARNING_MESSAGE);
            }
        }while(objPessoa.getOp() != 0 || objPessoa.getF() != "erro");
    }
}
