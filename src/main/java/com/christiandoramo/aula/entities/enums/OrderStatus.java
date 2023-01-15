package com.christiandoramo.aula.entities.enums;

public enum OrderStatus {
	PAID(2), SHIPPED(3), CANCELED(5), DELIVERED(4), WAITING_PAYMENT(1);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values())
			if (value.getCode() == code)
				return value;
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}

}
