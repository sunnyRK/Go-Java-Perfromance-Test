package main

import (
	"fmt"
	"time"
	"math/big"
)

func main(){
	var input int64
	fmt.Scanln(&input)
	newBigInt := big.NewInt(input)
	var before = makeTimestamp()
	fact(newBigInt)
	var after = makeTimestamp()
	// fmt.Println("Result: ",result)	
	var elapsedTime = after - before
	fmt.Println("Elapsed Time: ",elapsedTime/1000)
}

func fact(bigInt *big.Int) *big.Int {
	if(bigInt.Cmp(big.NewInt(1))==0) {
		return big.NewInt(1)
	}else{
		c:= big.NewInt(1)
		c= c.Sub(bigInt,big.NewInt(1))
			return bigInt.Mul(bigInt,fact(c))
	}
}

func makeTimestamp() int64 {
    return time.Now().UnixNano() / int64(time.Millisecond)
}