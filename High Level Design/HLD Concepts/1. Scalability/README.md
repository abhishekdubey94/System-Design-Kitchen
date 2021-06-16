# [Scalability](https://www.lecloud.net/tagged/scalability/chrono)

1. Clones -
   - Public servers of a scalable web service are hidden behind a load balancer. This load balancer evenly distributes load (requests from your users) onto your group/cluster of application servers.
   - **Every server should contain exactly the same codebase and should not store any user-related data, like sessions or profile pictures, on local disc or memory.**
   - Sessions need to be stored in a centralized data store which is accessible to all your application servers.
2. Database -
   - Two ways, either to stick with MySQL server and increase resources. Use sharding, denormalization and SQL tuning.
   - Use NoSQL database. Joins need to be done in application code.
3. Cache - Users still have to suffer slow page requests when a lot of data is fetched from the database. The solution is the implementation of a cache.
   - 2 patterns for caching data
     1. Cached Database Queries
     2. Cached Objects
   - Some ideas of objects to cache:
     - user sessions (never use the database!)
     - fully rendered blog articles
     - activity streams
     - user<->friend relationships
4. Asynchroism
   - 2 ways
     1. Doing the time-consuming work in advance and serving the finished work with a low request time.
     2. Using Queues - A user comes to your website and starts a very computing intensive task which would take several minutes to finish. So the frontend of your website sends a job onto a job queue and immediately signals back to the user: your job is in work, please continue to the browse the page. The job queue is constantly checked by a bunch of workers for new jobs. If there is a new job then the worker does the job and after some minutes sends a signal that the job was done. The frontend, which constantly checks for new “job is done” - signals, sees that the job was done and informs the user about it.

### Performance Vs Scalability

If you have a performance problem, your system is slow for a single user.
If you have a scalability problem, your system is fast for a single user but slow under heavy load.

### Latency vs throughput

Latency is the time to perform some action or to produce some result.
Throughput is the number of such actions or results per unit of time.
Generally, you should aim for maximal throughput with acceptable latency.
