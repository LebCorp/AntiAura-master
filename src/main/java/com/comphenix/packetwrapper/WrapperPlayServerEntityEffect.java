/*
 *  PacketWrapper - Contains wrappers for each packet in Minecraft.
 *  Copyright (C) 2012 Kristian S. Stangeland
 *
 *  This program is free software; you can redistribute it and/or modify it under the terms of the 
 *  GNU Lesser General Public License as published by the Free Software Foundation; either version 2 of 
 *  the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with this program; 
 *  if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 
 *  02111-1307 USA
 */

package com.comphenix.packetwrapper;

import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.potion.PotionEffectType;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayServerEntityEffect extends AbstractPacket {
	   public static final PacketType TYPE = PacketType.Play.Server.ENTITY_EFFECT;
	    
	    public WrapperPlayServerEntityEffect() {
	        super(new PacketContainer(TYPE), TYPE);
	        handle.getModifier().writeDefaults();
	    }
	    
	    public WrapperPlayServerEntityEffect(PacketContainer packet) {
	        super(packet, TYPE);
	    }
	    
	    /**
	     * Retrieve Entity ID.
	     * <p>
	     * Notes: entity's ID
	     * @return The current Entity ID
	     */
	    public int getEntityId() {
	        return handle.getIntegers().read(0);
	    }
	    
	    /**
	     * Set Entity ID.
	     * @param value - new value.
	     */
	    public void setEntityId(int value) {
	        handle.getIntegers().write(0, value);
	    }
	    
	    /**
	     * Retrieve Effect ID.
	     * <p>
	     * Notes: see [[1]]
	     * @return The current Effect ID
	     */
	    public byte getEffectId() {
	        return handle.getBytes().read(0);
	    }
	    
	    /**
	     * Set Effect ID.
	     * @param value - new value.
	     */
	    public void setEffectId(byte value) {
	        handle.getBytes().write(0, value);
	    }
	    
	    /**
	     * Retrieve Amplifier.
	     * @return The current Amplifier
	     */
	    public byte getAmplifier() {
	        return handle.getBytes().read(1);
	    }
	    
	    /**
	     * Set Amplifier.
	     * @param value - new value.
	     */
	    public void setAmplifier(byte value) {
	        handle.getBytes().write(1, value);
	    }
	    
	    /**
	     * Retrieve Duration.
	     * @return The current Duration
	     */
	    public int getDuration() {
	        return handle.getIntegers().read(1);
	    }
	    
	    /**
	     * Set Duration.
	     * @param value - new value.
	     */
	    public void setDuration(int value) {
	        handle.getIntegers().write(1, value);
	    }
	    
	    /**
	     * Retrieve Hide Particles.
	     * @return The current Hide Particles
	     */
	    public boolean getHideParticles() {
	        return handle.getBooleans().read(0);
	    }
	    
	    /**
	     * Set Hide Particles.
	     * @param value - new value.
	     */
	    public void setHideParticles(boolean value) {
	        handle.getBooleans().write(0, value);
	    }
}