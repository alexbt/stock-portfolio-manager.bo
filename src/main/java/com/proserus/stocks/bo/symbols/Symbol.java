package com.proserus.stocks.bo.symbols;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

public interface Symbol {

	public abstract Integer getId();

	public abstract Map<Integer, HistoricalPrice> getMapPrices();

	public abstract boolean isCustomPriceFirst();

	public abstract void setCustomPriceFirst(boolean isCustomPriceFirst);

	public abstract SectorEnum getSector();

	public abstract void setSector(SectorEnum sector);

	public abstract void setName(String name);

	public abstract void setTicker(String ticker);

	public abstract void setPrice(BigDecimal price, int year);

	public abstract void setCurrency(CurrencyEnum currency);

	public abstract String getName();

	public abstract String getTicker();

	public abstract HistoricalPrice getPrice(int year);

	public abstract Collection<HistoricalPrice> getHistoricalPricesValues();

	public abstract Collection<HistoricalPrice> getPrices();

	public abstract void addPrice(HistoricalPrice price);

	public abstract void setPrices(Collection<HistoricalPrice> prices);

	public abstract CurrencyEnum getCurrency();

	public abstract int hashCode();

}