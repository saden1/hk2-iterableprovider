hk2-iterableprovider
====================

Demo IterableProvider bug in HK2.

Looking at MessageProviderTest it appears that HK2 returns duplicate instances  
of MessageProvider implementations when it should only return 2 unique 
providers (HelloMessage and WorldMessage). This behavior is exhibited if you run
all the tests but not if you run the MessageProviderTest by itself. It appears 
that multiple injection and use of IterableProviders does not work in HK2.
