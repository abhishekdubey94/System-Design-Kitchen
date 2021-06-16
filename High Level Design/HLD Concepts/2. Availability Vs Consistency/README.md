### [CAP Theorem](https://robertgreiner.com/cap-theorem-revisited/)

- Consistency - A read is guaranteed to return the most recent write for a given client.
- Availability - A non-failing node will return a reasonable response within a reasonable amount of time (no error or timeout).
- Partition Tolerance - The system will continue to function when network partitions occur.

[CAP theorem simplified](http://ksat.me/a-plain-english-introduction-to-cap-theorem)

https://www.slideshare.net/jboner/scalability-availability-stability-patterns/32-FailoverReplication_MasterSlave_Tree_replication_MasterMaster

**Centralized System**
In a centralized system (e.g. RDBMS) we dont have network partition e.g P in CAP.
So we get both AVAILABILITY and CONSISTENCY.
A - Atomic
C - Consistent
I - Isolated
D - Durable

**Distributd System** (a collection of interconnected nodes that share data.)
In a distributed system we will have network partition e.g. P in CAP
So we have to PICK ONLY ONE : Availability OR Consistency.
So there are only 2 types of system - CP and AP
Basically Available
Soft state
Eventually consistent

Networks aren't reliable, so you'll need to support partition tolerance. You'll need to make a software tradeoff between consistency and availability.

CP - consistency and partition tolerance
Waiting for a response from the partitioned node might result in a timeout error. CP is a good choice if your business needs require atomic reads and writes. e.g MongoDB,Redis

AP - availability and partition tolerance
Responses return the most readily available version of the data available on any node, which might not be the latest. Writes might take some time to propagate when the partition is resolved. Cassandra,DynamoDB

AP is a good choice if the business needs allow for eventual consistency or when the system needs to continue working despite external errors.

## Consistency Patterns
