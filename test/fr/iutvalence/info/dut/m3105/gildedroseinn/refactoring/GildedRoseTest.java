package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class GildedRoseTest 
{
	private Item item;
	
	
	
	@Test
	public void updateAnItemShouldLowersItsQualityByOneEveryDay()
	{
		item = new Item("Magic test item", 10, 20);
		
		GildedRose.updateItem(item);
		
		assertEquals(item.getQuality(), 19);
		assertEquals(item.getSellIn(), 9);
	}
	
	@Test
	public void updateAnItemWithNegativeSellInShouldLowersItsQualityByTwoEveryDay()
	{
		item = new Item("Magic test item", -1, 12);
		
		GildedRose.updateItem(item);
		
		assertEquals(item.getQuality(), 10);
		assertEquals(item.getSellIn(), -2);
	}
	
	@Test
	public void updateAnItemWithAnUpdatedQualityLowerThanZeroShouldSetItToZero()
	{
		
		item = new Item("Magic test item", 10, 0);
		
		GildedRose.updateItem(item);
		
		assertEquals(item.getQuality(), 0);
		assertEquals(item.getSellIn(), 9);
	}
	
}
