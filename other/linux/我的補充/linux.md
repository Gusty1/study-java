# 我的補充

---

我的密碼都是: **123456**
[教學影片](https://www.bilibili.com/video/BV19W4y1w7cM/ '教學影片')

## VMware 下載

影片使用的版本是 pro 版，如果裝 player 版，影片講的很多功能都不能用。
Pro 是要錢的，可以試用 30 天，Player 不用錢，下方網址是 Player 版本。
[VMware 下載](https://www.vmware.com/content/vmware/vmware-published-sites/us/products/workstation-player.html.html 'VMware下載')
![VMware下載](./images/vmware.png 'VMware下載')

VMware 預設可能沒有裝==open-vm-tools==，這是一個可以讓你的虛擬機變得更好用的工具，像是可以讓 windows 檔案直接貼到 linux 上，或是讓複製的文字可以貼到 linux 裡。
[open-vm-tools 安裝](https://docs.vmware.com/cn/VMware-Tools/11.2.5/com.vmware.vsphere.vmwaretools.doc/GUID-C48E1F14-240D-4DD1-8D4C-25B6EBE4BB0F.html 'open-vm-tools安裝')

## linux iso 下載與安裝

基本上各個版本的 linux 這裡都可以下載，每個版本的簡單說明請看講義第 0 章。
[linux iso 下載](https://www.linuxlookup.com/linux_iso 'VMware下載')
安裝說明影片和講義都有

## Xshell 下載與安裝

遠端連線工具，正式版要錢，但有給個人、學生使用的免費版，影片也是用免費版的，下面的連結也是免費版，安裝好後輸入名字和電子郵件就可以使用了。
免費版有分 xshell 和 ftp，我想付錢版應該是有把這 2 個整合在一起的，免費版沒有，所以才要分 2 個下載。
[Xshell 下載](https://www.netsarang.com/en/free-for-home-school/ 'Xshell下載')

## ubuntu 安裝問題說明

影片是使用 centos，但 ubuntu 使用率也不低，各個版本的使用率如下表，所以我想 ubuntu 也是有必要了解的。
![linux市場佔有率](images/linux_market.png 'linux市場佔有率')

- ubuntu 裝好後是沒有 ssh 功能的，也就是說不能用 Xshell 直接連到 ubuntu，要另外裝工具(openssh-server)。
  [安裝 openssh-server](https://blog.csdn.net/weixin_40679412/article/details/95756562 '安裝openssh-server')
- ubuntu 預設是不能用 root 登入的，要用 root 登入需要作一些前置作業。
  ==在設定 root 密碼時，若密碼太簡單會一直提示你不行，但其實可以不用理他，就繼續打你的密碼就好，因為 root 就是老大。==
  [ubuntu root 登入](https://zhuanlan.zhihu.com/p/355555221 'ubuntu root登入')

## 其它

apt update，可以安裝工具和檢查更新，我覺得滿有用的。
[apt update](https://foreachsam.github.io/book-util-apt/book/content/command/apt/apt-update/ 'apt upadte')
