package com.likhit.basic.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author GatagatL
 *Albums
Alice loves dancing ! She is on the lookout for CD albums for her new dancing sessions. 
The albums may be of the same or different price. As she browses the music section of the store for new albums, 
she finds that there are N albums . All of the Alice's favourite albums lie in a range [L,R] (1<=L<=R<=N).

Alice wants to buy as many albums as possible. She wants to choose albums in such a way that price of each albums 
is evenly divisible by K, her favourite number.

Given N(number of albums) and price of each album you have to answer Q queries of form L R K where you have to 
tell maximum number of albums that Alice can buy in the range [L,R] and are perfectly divisible by K.

Input:

First line contain N i.e number of albums. 
Next line contains N integers denoting price of each album. 
Next line contains Q i.e number of queries. 
Next Q line contains three integers L R K.

Output:

For each query print maximum number of albums that Alice can buy satisfying her conditions.

Constraints

1<=N<=10^5
1<=Cost of each Album<=10^4
1<=Q<=10^6
1<=L<=R<=N
1<=K<=10^4

5
1 2 3 4 5
2
1 3 2
1 5 2

 */
public class AliceAlbum {
	private static String[] priceOfEachAlbum;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfAlbums = Integer.parseInt(br.readLine());
        if(numberOfAlbums >= 1 && numberOfAlbums <= 100000) {
        	boolean isConstraintViolated = false;
        	List<Integer> queryAnswer = new LinkedList<Integer>();
            priceOfEachAlbum = br.readLine().split(" ");
            for(int currentAlbum = 0; currentAlbum < priceOfEachAlbum.length; currentAlbum++) {
            	int currentAlbumPrice = Integer.parseInt(priceOfEachAlbum[currentAlbum]);
            	if(currentAlbumPrice < 1 || currentAlbumPrice > 10000) {
            		isConstraintViolated = true;
            	}
            }
            if(!isConstraintViolated) {
	            int numberOfQueries = Integer.parseInt(br.readLine());
	            if(numberOfQueries >= 1 && numberOfQueries <= 1000000) {
	            	for(int itrQuery = 0; itrQuery < numberOfQueries; itrQuery++) {
		            	String[] query = br.readLine().split(" ");
		            	int startRange = Integer.parseInt(query[0]) - 1;
		            	int endRange = Integer.parseInt(query[1]) - 1;
		            	int price = Integer.parseInt(query[2]);
		            	if(startRange >= 0 && endRange >= startRange && endRange <= numberOfAlbums-1 && price >=1 && price <= 1000)
		            		queryAnswer.add(getCount(startRange, endRange, price));
		            }
		            
		            Iterator<Integer> itr = queryAnswer.iterator();
		            while(itr.hasNext()) {
		            	System.out.println(itr.next());
		            }
	            }
	            else {
	            	System.err.println("Number of querues constraint violated");
	            }
            }
            else {
            	System.err.println("Album price constraint violated");
            }
            
        }
        else {
        	System.err.println("Number of albums constraint violated");
        }
	}
	
	public static int getCount(int startRange, int endRange, int price) {
		int countOfDivisibles = 0;
		for(int itr = startRange; itr <= endRange; itr++) {
			if(Integer.parseInt(priceOfEachAlbum[itr]) % price == 0) {
				countOfDivisibles++;
			}
		}
		return countOfDivisibles;
	}

}
