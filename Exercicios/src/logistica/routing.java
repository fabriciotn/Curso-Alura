package logistica;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;

public class routing {
	public static void main(String args[]) {
		routing app = new routing(args[0]);
	}

	public routing(String inFile) {
		try {
			RandomAccessFile file = new RandomAccessFile(inFile, "rw");
			String tmp = file.readLine();
			int i = 0;
			while (tmp != null) {
				tmp = file.readLine();
				i++;
			}

			file.seek(0);
			tmp = file.readLine();
			int graph[][];
			graph = new int[i][i];
			i = 0;
			while (tmp != null) {
				StringTokenizer sT = new StringTokenizer(tmp, " ");
				int j = 0;
				while (sT.hasMoreTokens()) {
					graph[i][j++] = Integer.parseInt(sT.nextToken());
				}
				i++;
				tmp = file.readLine();
			}
			file.close();

			dijkstra(graph);
		} catch (IOException io) {
			System.err.println(io.toString());
			System.exit(1);
		} catch (RuntimeException re) {
			System.err.println(re.toString());
			System.exit(1);
		}
	}

	public void dijkstra(int graph[][]) {
		int d[] = new int[graph.length];
		int dC[] = new int[graph.length];
		int p[] = new int[graph.length];
		for (int i = 0; i < graph.length; i++) {
			d[i] = 100;
			dC[i] = 100;
			p[i] = -1;
		}
		d[0] = 0;
		dC[0] = 0;

		int i = 0, min = 200, pos = 0; // You can change the min to 1000 to make
										// it the largest number
		while (i < graph.length) {
			// extract minimum
			for (int j = 0; j < dC.length; j++) {
				if (min > d[j] && dC[j] != -1) {
					min = d[j];
					pos = j;
				}
			}
			dC[pos] = -1;

			// relax
			for (int j = 0; j < graph.length; j++) {
				if (d[j] > graph[pos][j] + d[pos]) {
					d[j] = graph[pos][j] + d[pos];
					p[j] = pos;
				}
			}
			i++;
			min = 200;
		}

		for (int j = 0; j < p.length; j++) {
			System.out.print(p[j] + " ");
		}
		System.out.print("\n");
		for (int j = 0; j < d.length; j++) {
			System.out.print(d[j] + " ");
		}
		System.out.print("\n");
	}
}