package com.jmk.dao;

import java.util.Date;
import java.util.List;

import com.jmk.beans.ItemSale;

public interface ItemSaleDAO {

	public int[] saveItems(List<ItemSale> itemSalesList);

	public List<ItemSale> getAllSaleItems();

	public List<ItemSale> getAllSaleItems(Long transactionId);

	public List<ItemSale> getAllSaleItemsByCustomerId(Long customerId);

	public List<ItemSale> getAllSaleItems(Date from);

	public List<ItemSale> getAllSaleItems(Date from, Date to);

	public Integer deleteTransaction(Long transationId);

}
