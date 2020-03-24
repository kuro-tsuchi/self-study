package main

import (
	"fmt"
	"github.com/gin-gonic/gin"
	"github.com/go-redis/redis"
	"github.com/sirupsen/logrus"
)

var (
	rdb *redis.ClusterClient
)
var logger = logrus.New()
var entry = logger.WithFields(logrus.Fields{
	"animal": "walrus",
	"size":   10,
})

func main() {
	router := gin.Default()
	router.POST("test", Test)
	router.Run(":8080")
}
func Test(context *gin.Context) {
	rdb.Set("test", 111, -1)
	get := rdb.Get("test").String()
	fmt.Println(get)
	entry.Info("A group of walrus emerges from the ocean")
}

func init() {
	rdb = redis.NewClusterClient(&redis.ClusterOptions{
		Addrs: []string{":7000", ":7001", ":7002", ":7003", ":7004", ":7005"},
	})
	result, err := rdb.Ping().Result()
	if err != nil {

	}
	fmt.Println(result)
}
