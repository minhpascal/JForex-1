/**
 * 
 */
package trading.elements;

/**
 * Describes events generated by broker: entry order fill, stop loss triggered, take profit triggered...
 */
public interface IBrokerEvent {
	
	public enum BrokerEventType { ENTRY_FILL, STOP_LOSS, TAKE_PROFIT }
	
	public long getTime();
	public BrokerEventType getType();
	public String getTicker();
	public String getOrderID();

}