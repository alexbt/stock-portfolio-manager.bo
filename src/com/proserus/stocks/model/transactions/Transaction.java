package com.proserus.stocks.model.transactions;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import org.joda.time.DateTime;

import com.proserus.stocks.model.symbols.Symbol;

public interface Transaction {

	public static String IN_LABELS = "in elements(t.labels)";
	//TODO Maybe the same label can be set twice 
	public abstract void addLabel(Label label);

	public abstract BigDecimal getCommission();

	public abstract Date getDate();

	public abstract DateTime getDateTime();

	public abstract Integer getId();

	public abstract Collection<Label> getLabelsValues();

	public abstract BigDecimal getPrice();

	public abstract BigDecimal getQuantity();

	public abstract Symbol getSymbol();

	public abstract TransactionType getType();

	public abstract void removeLabel(Label label);

	public abstract void setCommission(BigDecimal commission);

	public abstract void setDate(Date date);

	public abstract void setDateTime(DateTime date);

	//TODO Maybe the same label can be set twice
	//When removing labels.. we need to remove the transaction link too...
	public abstract void setLabels(Collection<Label> labels);

	public abstract void setPrice(BigDecimal price);

	public abstract void setQuantity(BigDecimal quantity);

	public abstract void setSymbol(Symbol symbol);

	public abstract void setType(TransactionType type);

}