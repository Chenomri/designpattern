package Model;

import java.util.ArrayList;
import java.util.Stack;

import javax.sound.midi.VoiceStatus;
import javax.sound.sampled.Port;

import javafx.beans.binding.SetExpression;

public class SeaPort {

	private String name;
	private String country;
	private LoadingDock<Containerr> loadContainer;
	private ArrayList<Track> tracks;
	private ArrayList<Ship> ships;

	public SeaPort() {
		this("defualt", "defualt");
}

	public SeaPort( String name, String country) {
		setName(name);
		setCountry(country);
		tracks = new ArrayList<Track>();
		ships = new ArrayList<Ship>();
		
	}
	
	public void addTracks(Track track) {
		tracks.add(track);
	}
	public void addTracks() {
		tracks.add(new Track<Containerr>(300, 405, 200, 60, 0));
	}
	public void removeTracks() {
		tracks.remove(0);	
	}
	public void addShips(Ship ship) {
		this.ships.add(ship);
	}
	public void addShips() {

		this.ships.add(new Ship<Containerr<Object>>(200, 400, 400, 80, 15));
	}
	public void removeShip() {
		ships.remove(0);
	}
	public void addLodaDock() {
		this.loadContainer=new LoadingDock<Containerr>(600,480);;
	}
	public void setLoadContainer(LoadingDock<Containerr> loadContainer) {
		this.loadContainer = loadContainer;
	}
	public ArrayList<Ship> getShips() {
		return ships;
	}
	
	
	
	
	
	
	
	public void addContainerToShip( Containerr  container) {
		ships.get(0).addContainers(container);
		
	}
	public void addContainerToShip( ) {
		ships.get(0).addContainers(new Containerr<Object>(0, 0,100, 30));
		
	}
	public LoadingDock<Containerr> getLoadContainer() {
		return loadContainer;
	}

	public Containerr removeContainerFromLoad() {
		return loadContainer.getContainers() ;
	}
	public Containerr moveContainers() {
		return ships.get(0).getTopContainer();
	}
	public boolean addMarkToContainerByIndex(int x , int y , boolean mark) {
		return ships.get(0).addMarkToContainerByIndex(x, y,mark) ;
	}
	public Containerr removeContainersToStackNumber(int stackNumber) {
		return ships.get(0).removeContainersToStackNumber(stackNumber);
	}
public void backContainerToship(Containerr c) {
		ships.get(0).backContainerToship(c);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public  int getMaxheigth() {
		return ships.get(0).getMaxheigth();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

	public ArrayList<Track> getTracks() {
		return tracks;
	}
	
	public Containerr removeContainerFromShipByIndex(int x,int y){
		return ships.get(0).getTopContainerByIndex(x, y);
	}
	
	public boolean addContainerToShipByIndex(int stackNumber,Containerr<Object> c ) {
		
	return 	ships.get(0).addContainersToStackNumber(c, stackNumber);
	}

	public boolean addContainerToDock(Containerr containerr) {
		return loadContainer.addContainers(containerr);
	}
	public int[] getLocatedStackMarkContainer() {
		return ships.get(0).getLocatedStackMarkContainer();
	}
	
	public boolean addContainerToTrack(int indexStockX , int indexStockY ) {
		
		return 	tracks.get(0).addContainers(ships.get(0).getTopContainerByIndex(indexStockX, indexStockY));
		
	}
	
public boolean addContainerToTrack(Containerr containerr ) {
		
		return 	tracks.get(0).addContainers(containerr);
		
	}

	public void addToLoadContainer(Containerr loadContainer) {
		this.loadContainer.addContainers(loadContainer);
	}
	
	
	
	
	


	

}
