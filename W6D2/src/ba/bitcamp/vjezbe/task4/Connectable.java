package ba.bitcamp.vjezbe.task4;

import ba.bitcamp.vjezbe.task1.Computer;
import ba.bitcamp.vjezbe.task2.Network;

public interface Connectable {

	void connect(Computer c);

	void connect(Network n);

	void disconnect();

}
