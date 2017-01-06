package com.Projet;

import java.util.ArrayList;
import com.Task.typeTask;

public class Projet {
	String nom;
	ArrayList<typeTask>listTask=new ArrayList<typeTask>();
	
	public Projet(String nom){
		this.nom=nom;
	}
	
	public String getNom(){
		return nom;
	}
	
	public ArrayList<typeTask> getList(){	
		return listTask;
	}
	
	public void addTask(typeTask nTask){
		listTask.add(nTask);
	}
	
	public String afficher(){
		//TODO
		String mesTaches = getNom();
		mesTaches += "\n";
		for(int i = 0; i < listTask.size();i++){
			mesTaches+="	"+listTask.get(i).toString()+"\n";
		}
		mesTaches+="\n";
		return mesTaches;
	}
}
