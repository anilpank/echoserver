package com.server;

import java.net.*;
import java.io.*;

public class SocketUtilities {
	/** Make a BufferedReader to get incoming data. */

	public static BufferedReader getReader(Socket s)
			throws IOException {
		return(new BufferedReader(
				new InputStreamReader(s.getInputStream())));
	}
	/** Make a PrintWriter to send outgoing data.
	 * This PrintWriter will automatically flush stream
	 * when println is called.
	 */
	public static PrintWriter getWriter(Socket s)
			throws IOException {
		// Second argument of true means autoflush.
		return(new PrintWriter(s.getOutputStream(), true));
	}

}
