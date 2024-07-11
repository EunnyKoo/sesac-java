# CriminalIP-CTIDB-Feed

This repository provides a daily updated list of IP addresses derived from the Criminal IP's CTIDB (Comprehensive IP-based Threat Intelligence Database) under the C2_TI license. Our aim is to offer a sample of 100 IP addresses daily, highlighting the threats identified by CIP, and to encourage users to consider the full version of our data for more extensive threat intelligence.

## Purpose
1. To notify the community about the threat data provided by CIP through GitHub.
2. To offer a free daily sample of 100 IP addresses from CTIDB's C2_TI license, promoting the full data purchase.

## Overview
This repository automatically updates every day with 100 IP addresses sourced from CTIDB's C2_TI license. The selection criteria for these IPs include various conditions such as tags and honeypot detections. The IPs are distributed across different conditions to provide a diverse sample.

## Criteria for IP Selection
- **Tags**: IPs with C2_xx tags.
- **Honeypot Detections**: IPs caught in honeypots.
- Additional conditions as specified by senior analysts.

### Data Fields
The data provided includes the following fields, identical to those in the C2_TI license:
- **IP**: The IP address.
- **Country**: Country of origin.
- **AS Name**: Autonomous System name.
- **Reverse DNS**: Reverse DNS lookup result.
- **Opened Ports**: Ports open on the IP address (formatted as `[80, 443]`).
- **CVE**: Common Vulnerabilities and Exposures associated (if any).
- **Description**: Brief description of the threat.

## How to Use
You can download the list directly from the repository. Here’s a simple way to fetch the list and use it with iptables and ipset:

```sh
sudo su
apt-get -qq install iptables ipset
ipset -q flush ctidb_ips
ipset -q create ctidb_ips hash:ip
for ip in $(curl --compressed https://raw.githubusercontent.com/yourusername/CriminalIP-CTIDB-Feed/main/ipsum.txt 2>/dev/null); do ipset add ctidb_ips $ip; done
iptables -D INPUT -m set --match-set ctidb_ips src -j DROP 2>/dev/null
iptables -I INPUT -m set --match-set ctidb_ips src -j DROP
