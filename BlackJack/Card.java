// данный файл описывает класс "Карта", у которой есть:
// 1. значение - Value
// 2. масть - Suit
// 3. методы, которые позволяют всё это дело получить (:

public class Card {

	
    public enum Value {
    	// тут лежат значения карт
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

        // создадим метод для того, чтобы получать значения карт
    	// карты стоят по очереди, так что мы получим значения по их индексам
        public static Value getValues(int index) {
            Value[] values = Value.values();
            return values[index];
        }
        
        public static int getValueLen() {
        	return Value.values().length;
        }
    }
    
    
    public enum Suit {
    	// тут лежат масти
    	// Spades - пики Hearts - черви Clubs - трефы Diamonds - бубны
    	SPADES, HEARTS, CLUBS, DIAMONDS;
    	
    	public static Suit getSuit(int index) {
    		Suit[] suits = Suit.values();
    		return suits[index];
    	}
    	
    	public static int getSuitLen() {
    		return Suit.values().length;
    	}
    	
    }
    
    private Suit suit;
    private Value value;
    
    // конструктор класса - создаём экземпляр класса Card
    public Card(Suit suit, Value value) {
    	this.suit = suit;
    	this.value = value;
    }
    
    public Suit getSuit() {
    	// получить масть
    	return this.suit;
    }
    
    public Value getValue() {
    	// получить значение
    	return this.value;
    }
    
    public String toString() {
    	// получим в красивом виде масть и значение
    	return this.suit + "_" + this.value;
    }
    
}
