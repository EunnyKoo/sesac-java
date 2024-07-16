# C2-Daily-Feed

This repository provides a daily updated list of IP addresses derived from Criminal IP (https://www.criminalip.io/) under the C2_TI license. Our aim is to offer a sample of 100 IP addresses daily, highlighting the threats identified by CIP, and to encourage users to consider the full version of our data for more extensive threat intelligence.

## Purpose

- To notify the community about the threat data provided by CIP through GitHub.
- To offer a free daily sample of 100 IP addresses from C2_TI license, promoting the full data purchase.

## Overview

This repository automatically updates every day with 100 IP addresses sourced from the C2_TI license. The selection criteria for these IPs include various conditions such as tags and honeypot detections. The IPs are distributed across different conditions to provide a diverse sample.

## Criteria for IP Selection

- **Tags:** IPs with C2_xx tags.
- **Honeypot Detections:** IPs caught in honeypots.
- **Additional conditions** as specified by senior analysts.

## Data Fields

The data provided includes the following fields, identical to those in the C2_TI license:

| Field                  | Description                                           |
|------------------------|-------------------------------------------------------|
| **IP Address**         | The IP address.                                       |
| **Target C2**          | Type of Command and Control server.                   |
| **Open Ports**         | Ports open on the IP address (formatted as [80, 443]).|
| **Score (Inbound/Outbound)** | Threat score for inbound and outbound traffic.  |
| **Country**            | Country of origin.                                    |
| **Scan Time**          | Time when the scan was conducted.                     |

## How to Use

You can download the list directly from the repository. Here’s a simple way to fetch the list and use it with iptables and ipset:

```bash
sudo su
apt-get -qq install iptables ipset
ipset -q flush ctidb_ips
ipset -q create ctidb_ips hash:ip
for ip in $(curl --compressed https://raw.githubusercontent.com/yourusername/CriminalIP-CTIDB-Feed/main/ipsum.txt 2>/dev/null); do ipset add ctidb_ips $ip; done
iptables -D INPUT -m set --match-set ctidb_ips src -j DROP 2>/dev/null
iptables -I INPUT -m set --match-set ctidb_ips src -j DROP
```

## Example of Daily IP Addresses List

Here is an example of the daily list format:

| IP Address     | Target C2      | Open Ports | Score (Inbound/Outbound) | Country | Scan Time             |
|----------------|----------------|------------|--------------------------|---------|-----------------------|
| 159.69.20.142  | C2             | 80         | Safe/Critical            | de      | 2024-07-15 11:51:54   |
| 4.180.220.199  | c2_meshagent   | 80         | Critical/Critical        | nl      | 2024-07-15 11:49:49   |
| 110.40.133.81  | c2_meshagent   | 80         | Safe/Critical            | cn      | 2024-07-15 11:48:44   |

