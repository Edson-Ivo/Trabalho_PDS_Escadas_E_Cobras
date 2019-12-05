package Tabuleiro;

import Casa.AbstratoCasa;
import PP_Fabrica.EnumCasa;
import PP_Fabrica.FabricaCasa;
import PP_Fabrica.IFabricaCasa;
import java.util.ArrayList;

public class FazerTabuleiro {

    ArrayList<Integer> cobra_ini;
    ArrayList<Integer> cobra_fim;
    ArrayList<Integer> escada_ini;
    ArrayList<Integer> escada_fim;
    ArrayList<AbstratoCasa> casas;
    ArrayList<Integer> bonus;
    
    public FazerTabuleiro(){
        this.cobra_ini = new ArrayList();
        this.escada_ini = new ArrayList();
        this.casas = new ArrayList();
        this.cobra_fim = new ArrayList();
        this.escada_fim = new ArrayList();
        this.bonus = new ArrayList();
        
        cobra_ini.add(15);
        cobra_ini.add(39);
        cobra_ini.add(49);
        cobra_ini.add(57);
        cobra_ini.add(75);
        cobra_ini.add(88);
        cobra_ini.add(97);
        
        cobra_fim.add(9);
        cobra_fim.add(17);
        cobra_fim.add(12);
        cobra_fim.add(46);
        cobra_fim.add(47);
        cobra_fim.add(36);
        cobra_fim.add(65);
        
        escada_ini.add(3);
        escada_ini.add(6);
        escada_ini.add(14);
        escada_ini.add(38);
        escada_ini.add(41);
        escada_ini.add(69);
        escada_ini.add(89);
        
        escada_fim.add(37);
        escada_fim.add(16);
        escada_fim.add(32);
        escada_fim.add(44);
        escada_fim.add(85);
        escada_fim.add(87);
        escada_fim.add(91);
        
        bonus.add(4);
        bonus.add(21);
        bonus.add(26);
        bonus.add(52);
        bonus.add(72);
        bonus.add(80);
        
    }
    
    public ArrayList<AbstratoCasa> fazerCasas(){  
        IFabricaCasa fabrica = new FabricaCasa();
        int i = 1;
        casas.add(fabrica.criarCasa(EnumCasa.casa, 0, 0, 0, 0));
        int cobrafimCont = 0;
        int escadafimCont = 0;
        
        for(int y = 570; y >= 30; y -= 60){
            if((y/60)%2 == 0){
                for(int x = 780; x >= 240; x -= 60){
                    if(cobra_ini.contains(i)){
                        casas.add(fabrica.criarCasa(EnumCasa.cobra_casa, i, x, y, cobra_fim.get(cobrafimCont)));
                        cobrafimCont++;
                    }else if(escada_ini.contains(i)){
                        casas.add(fabrica.criarCasa(EnumCasa.escada_casa, i, x, y, escada_fim.get(escadafimCont)));
                        escadafimCont++;
                    }else if(bonus.contains(i)){
                        casas.add(fabrica.criarCasa(EnumCasa.casa_bonus, i, x, y, i));
                    }else{
                        casas.add(fabrica.criarCasa(EnumCasa.casa, i, x, y, i));
                    }
                    i++;
                }
            }else{   
                for(int x = 240; x <= 780; x += 60){
                    if(cobra_ini.contains(i)){
                        casas.add(fabrica.criarCasa(EnumCasa.cobra_casa, i, x, y, cobra_fim.get(cobrafimCont)));
                        cobrafimCont++;
                    }else if(escada_ini.contains(i)){
                        casas.add(fabrica.criarCasa(EnumCasa.escada_casa, i, x, y, escada_fim.get(escadafimCont)));
                        escadafimCont++;
                    }else if(bonus.contains(i)){
                        casas.add(fabrica.criarCasa(EnumCasa.casa_bonus, i, x, y, i));
                    }else{
                        casas.add(fabrica.criarCasa(EnumCasa.casa, i, x, y, i));
                    }
                    i++;
                }
            }             
        }
        return casas;
    }   
}
