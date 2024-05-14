package estabelecimento;

import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;


public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		Impressora impressora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}
}
