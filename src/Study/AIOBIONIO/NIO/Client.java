/**  
* <p>Title: Client.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) Mar 30, 2020</p>  
* @author 马坤  
* @date Mar 30, 2020  
* @version 1.0  
*/ 
package Study.AIOBIONIO.NIO;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Client {
	public static void main(String[] args) {
		//创建链接的地址
		InetSocketAddress address = new InetSocketAddress("127.0.0.1", 8765);
		//声明连接通道
		SocketChannel sc = null;
		//建立缓冲区
		ByteBuffer buf = ByteBuffer.allocate(1024);
		
		try {
			//打开通道
			sc = SocketChannel.open();
			//进行链接
			sc.connect(address);
			while (true) {
				//定义一个字节数组，然后使用系统录入功能
				byte[] bytes = new byte[1024];
				System.in.read(bytes);
				//把数据放到缓冲区
				buf.put(bytes);
				//对缓冲区数据复位
				buf.flip();
				//写出数据
				sc.write(buf);
				//清空缓冲区
				buf.clear();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (sc != null) {
				try {
					sc.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
