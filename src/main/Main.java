/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import compositeComponents.Case;
import compositeComponents.Computer;
import compositeComponents.Motherboard;
import java.util.ArrayList;
import java.util.List;
import simpleComponents.BIOS;
import simpleComponents.CPU;
import simpleComponents.HardDrive;
import simpleComponents.Keyboard;
import simpleComponents.Monitor;
import simpleComponents.Mouse;
import simpleComponents.Port;
import simpleComponents.PowerCord;
import simpleComponents.PowerSupply;
import simpleComponents.RAM;
import simpleComponents.Slot;
import simpleComponents.VideoCard;

/**
 *
 * @author Alex
 */
public class Main {

    public static void main(String[] args) {
        
        Case c = buildCase();
        Keyboard kb = new Keyboard(90.90, "Scandinavic");
        Mouse mouse = new Mouse(65.90, Mouse.MOUSE_TYPE.TRADITIONAL);
        Monitor m = new Monitor(399.90, Monitor.MONITOR_TYPE.LCD);
        PowerCord pc = new PowerCord(9.90, 5, 230);
        
        Computer computer = new Computer(c, kb, mouse, m, pc);
        computer.print();
        System.out.println("\n-------------------------\n");
        
        System.out.println("Price: " + computer.getPrice());
        
    }
    
    public static Case buildCase(){
        
        HardDrive hd = new HardDrive(350.90, 1024, HardDrive.HDD_TYPE.SATA);
        Motherboard mb = buildMotherboard();
        PowerSupply ps = new PowerSupply(60.90);
        
        List<Port> ports = new ArrayList<>();
        ports.add(new Port(10.90, Port.PORT_TYPE.USB));
        ports.add(new Port(10.90, Port.PORT_TYPE.USB));
        ports.add(new Port(10.90, Port.PORT_TYPE.USB));
        ports.add(new Port(10.90, Port.PORT_TYPE.USB));
        ports.add(new Port(8.60, Port.PORT_TYPE.ETHERNET));
        ports.add(new Port(10.90, Port.PORT_TYPE.MONITOR));
        ports.add(new Port(10.90, Port.PORT_TYPE.HDMI));
        ports.add(new Port(10.90, Port.PORT_TYPE.MOUSE));
        ports.add(new Port(10.90, Port.PORT_TYPE.KEYBOARD));
        
        VideoCard vc = new VideoCard(210.90, 2);
        
        return new Case(hd, mb, ps, ports, vc, Case.CASE_TYPE.TOWER);
    }
    
    public static Motherboard buildMotherboard(){
        
        CPU cpu = new CPU(55.40, 2.80);
        RAM ram = new RAM(26.70, 16);
        BIOS bios = new BIOS(30.90);
        List<Slot> slots = new ArrayList<>();
        slots.add(new Slot(15.90, "CPU"));
        slots.add(new Slot(15.90, "RAM"));
        slots.add(new Slot(15.90, "PCI"));
        slots.add(new Slot(15.90, "PCI"));
        slots.add(new Slot(15.90, "PCI"));
        
        return new Motherboard(cpu, ram, bios, slots);      
    }
    
    
    
}
