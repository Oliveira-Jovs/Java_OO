import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeuControlador implements ActionListener {
    private MeuModelo modelo;
    private MinhaVisao visao;
    
    public MeuControlador(MeuModelo modelo, MinhaVisao visao) {
        this.modelo = modelo;
        this.visao = visao;
        
        // Registrando o controlador como ouvinte de eventos na visão
        this.visao.addBotaoListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == visao.getBotao()) {
            // O evento foi disparado pelo botão na visão
            
            // Obtendo os dados da visão
            String texto = visao.getTextoCampo();
            
            // Atualizando o modelo
            modelo.setDados(texto);
            
            // Realizando alguma lógica de negócio com os dados
            
            // Atualizando a visão com os resultados
            visao.atualizarResultado(modelo.getResultado());
        }
    }
}

