package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class GildedRoseTest 
{
	
	@Test
	void updateAnItemShouldLowersItsQualityByOneEveryDay()
	{
		Item item = new Item("+5 Dexterity Vest", 10, 20);
		
		GildedRose.updateItem(item);
		
		assertEquals(item.getQuality(), 19);
		assertEquals(item.getSellIn(), 9);
	}
}
