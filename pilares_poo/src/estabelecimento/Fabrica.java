package estabelecimento;

import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.DeskJet;

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
