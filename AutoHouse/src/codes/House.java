/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

/**
 *
 * @author lennon
 */
public abstract class House{
    	private boolean alarm = false, gate = true, luz = false;
        public void setLight(boolean light){
        	this.luz = light;
	}
	public boolean getLight(){
            return this.luz;
        }
        public boolean mudaLuz(boolean atual){
            boolean light = !atual;
            return light;
        }
        
	public void setAlarm(boolean alarm){
		this.alarm = alarm;		
	}
	public void setGate(boolean gate){
		this.gate = gate;		
	}
	public boolean getAlarm(){
            return this.alarm;
        }
        public boolean getGate(){
            return this.gate;
        }
        //mudanças
        public boolean mudaPortao(boolean atual){
            boolean gate = !atual;
            return gate;
        }
        public boolean mudaAlarme(boolean atual){
            boolean alarme = !atual;
            return alarme;
        }
}