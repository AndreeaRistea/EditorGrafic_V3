package data;

import java.util.Vector;


import view.Observer;

public class GestiuneFiguriGeometrice 
{
	Vector <Observer> observers;
	Vector <FiguraGeometrica> figuriGeometrice;
	
	public static GestiuneFiguriGeometrice instantaGestiune;
	
	private GestiuneFiguriGeometrice()
	{
		observers = new Vector<Observer>();
		figuriGeometrice = new Vector<FiguraGeometrica>();
	}
	
	public static GestiuneFiguriGeometrice CreareGestiune()
	{
		if(instantaGestiune == null)
		{
			instantaGestiune = new GestiuneFiguriGeometrice();
		}
		return instantaGestiune;
	}
	public void Adauga (Observer d)
	{
		observers.add(d);
	}
	public void Sterge (Observer o)
	{
		observers.remove(o);
	}
	public void AdaugaFigura (FiguraGeometrica f)
	{
		figuriGeometrice.add(f);
		this.UpdateAll();
	}
	public void StergeFigura (FiguraGeometrica f)
	{
		figuriGeometrice.remove(f);
		this.UpdateAll();
	}
	private void UpdateAll ()
	{
		for(int i = 0; i<observers.size();i++)
		{
			observers.get(i).update();
		}
	}
	
}
