package bus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class car {
  public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
    System.setProperty("file.encoding", "UTF-8");
    Statement st=DaoCon.getConnection().createStatement();
    int a1=1;
    while(a1!=0){
      System.out.println("***********长途汽车信息管理系统*********");
      System.out.println("**                             **");
      System.out.println("** 1.查询    2.插入    3.修改    4.删除    5.退出  **");
      System.out.println("**                             **");
      System.out.println("*********************************\n");
      System.out.println("请选择：");
      int i=0;
      BufferedReader br1=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
      i=Integer.parseInt(br1.readLine());
      if(i==5)  a1=0;
      if(i==1)
      {
        System.out.println("1.汽车查询    2.线路查询    3.车票查询");
        System.out.println("请选择：");
        int m=0;
        try{
          BufferedReader br2=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
          m=Integer.parseInt(br2.readLine());
        }catch(IOException ex){}
        if(m==1){
          String select="select * from bus.bus.qiche";
          ResultSet rs=st.executeQuery(select);
          Wrap.Qtitle();
          while(rs.next()){
            String a=rs.getString("bianhao");
            String b=rs.getString("zhonglei");
            String c=rs.getString("zaike");
            String d=rs.getString("piaojia");
            System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
          } }
        if(m==2){
          String select="select * from bus.bus.xianlu";
          ResultSet rs=st.executeQuery(select);
          Wrap.Xtitle();
          while(rs.next()){
            String a=rs.getString("bianhao");
            String b=rs.getString("chufadi");
            String c=rs.getString("mudidi");
            String d=rs.getString("shijian");
            System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"h");
          }}
        if(m==3){
          String select="select * from bus.bus.chepiao";
          ResultSet rs=st.executeQuery(select);
          Wrap.Ctitle();
          while(rs.next()){
            String a=rs.getString("bianhao");
            String b=rs.getString("shoupiao");
            String c=rs.getString("shengyu");
            String d=rs.getString("VIP");
            System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
          }}    }

      if(i==2)
      {
        System.out.println("1.汽车信息插入    2.线路信息插入    3.车票信息插入");
        System.out.println("请选择：");
        int m=0;
        try{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
          m=Integer.parseInt(br.readLine());
        }catch(IOException ex){}
        if(m==1){
          String c1="",c2="",c3="",c4="";
          System.out.println("输入你要插入的车次编号：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            c1=br.readLine();
          }catch(IOException ex){}
          System.out.println("c1="+c1);
          System.out.println("输入你要插入的汽车种类：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            c2=br.readLine();
          }catch(IOException ex){}
          System.out.println("c2="+c2);
          System.out.println("输入你要插入的载客人数：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            c3=br.readLine();
          }catch(IOException ex){}
          System.out.println("c3="+c3);
          System.out.println("输入你要插入的汽车票价：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            c4=br.readLine();
          }catch(IOException ex){}
          System.out.println("c4="+c4);
          String insert="insert into bus.bus.qiche(bianhao,zhonglei,zaike,piaojia)values" +
                  "('"+c1+"','"+c2+"','"+c3+"','"+c4+"')";
          DaoCon.getConnection().createStatement().executeUpdate(insert);
          System.out.println("插入成功!");


        }
        if(m==2){
          String c1="",c2="",c3="",c4="";
          System.out.println("输入你要插入的车次编号：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            c1=br.readLine();
          }catch(IOException ex){}
          System.out.println("c1="+c1);
          System.out.println("输入你要插入的出发地：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            c2=br.readLine();
          }catch(IOException ex){}
          System.out.println("c2="+c2);
          System.out.println("输入你要插入的目的地：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            c3=br.readLine();
          }catch(IOException ex){}
          System.out.println("c3="+c3);
          System.out.println("输入你要插入的所用时间：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            c4=br.readLine();
          }catch(IOException ex){}
          System.out.println("c4="+c4);

          System.out.println("插入成功!");
          String insert="insert into bus.bus.xianlu(bianhao,chufadi,mudidi,shijian)values" +
                  "('"+c1+"','"+c2+"','"+c3+"','"+c4+"')";
          DaoCon.getConnection().createStatement().executeUpdate(insert);


        }
        if(m==3){
          String c1="",c2="",c3="",c4="";

          System.out.println("输入你要插入的车次编号：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            c1=br.readLine();
          }catch(IOException ex){}
          System.out.println("c1="+c1);
          System.out.println("输入你要插入的总售票数：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            c2=br.readLine();
          }catch(IOException ex){}
          System.out.println("c2="+c2);
          System.out.println("输入你要插入的剩余票数：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            c3=br.readLine();
          }catch(IOException ex){}
          System.out.println("c3="+c3);
          System.out.println("输入你要插入的已售票数：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            c4=br.readLine();
          }catch(IOException ex){}
          System.out.println("c4="+c4);
          PreparedStatement pstmt2=DaoCon.getConnection().prepareStatement("insert into bus.bus.chepiao values(?,?,?,?)");
          pstmt2.setString(1,c1);
          pstmt2.setString(2,c2);
          pstmt2.setString(3,c3);
          pstmt2.setString(4,c4);
          pstmt2.executeUpdate();
          System.out.println("插入成功!");
        }
      }

      if(i==3)
      {
        System.out.println("1.汽车信息修改    2.线路信息修改    3. 车票信息修改");
        System.out.println("请选择：");
        int m=0;
        try{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
          m=Integer.parseInt(br.readLine());
        }catch(IOException ex){}
        if(m==1){
          String m11="";String m13="";int m12=0;
          System.out.println("选择你要修改车次的编号：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            m11=br.readLine();
          }catch(IOException ex){}
          PreparedStatement pstmt31=DaoCon.getConnection().prepareStatement("select * from bus.bus.qiche where bianhao=?");
          pstmt31.setString(1,m11);
          ResultSet rs3=pstmt31.executeQuery();
          if(rs3.next()){
            System.out.println("输入你要修改的项：1.汽车种类      2.载客人数     3.汽车票价");
            try{
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
              m12=Integer.parseInt(br.readLine());
            }catch(IOException ex){}
            if(m12==1){System.out.println(" 输入你修改后的值:  ");
              try{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                m13=br.readLine();
              }catch(IOException ex){}
              pstmt31.close();
              PreparedStatement pstmt3=DaoCon.getConnection().prepareStatement("Update bus.bus.qiche set zhonglei=? where  bianhao=?");
              pstmt3.setString(1,m13);
              pstmt3.setString(2,m11);
              pstmt3.executeUpdate();
              System.out.println("修改成功! ");
            }
            if(m12==2){System.out.println(" 输入你修改后的值:");
              try{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                m13=br.readLine();
              }catch(IOException ex){}
              pstmt31.close();
              PreparedStatement pstmt3=DaoCon.getConnection().prepareStatement("Update bus.bus.qiche set zaike=? where  bianhao=?");
              pstmt3.setString(1,m13);
              pstmt3.setString(2,m11);
              pstmt3.executeUpdate();
              System.out.println("修改成功!");
              rs3.close();
            }
            if(m12==3){System.out.println(" 输入你修改后的值:");
              try{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                m13=br.readLine();
              }catch(IOException ex){}
              pstmt31.close();
              PreparedStatement pstmt3=DaoCon.getConnection().prepareStatement("Update bus.bus.qiche set piaojia=? where bianhao=?");
              pstmt3.setString(1,m13);
              pstmt3.setString(2,m11);
              pstmt3.executeUpdate();
              System.out.println("修改成功!");
              rs3.close();
            }
          }
          else{System.out.println("你要更改的项不存在!");}
        }
        if(m==2){
          String m11="";String m13="";int m12=0;
          System.out.println("选择你要修改车次编号：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            m11=br.readLine();
          }catch(IOException ex){}
          PreparedStatement pstmt31=DaoCon.getConnection().prepareStatement("select * from bus.bus.xianlu where bianhao=?");
          pstmt31.setString(1,m11);
          ResultSet rs3=pstmt31.executeQuery();
          if(rs3.next()){
            System.out.println("输入你要修改的项：1.出发地      2.目的地      3.所用时间");
            try{
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
              m12=Integer.parseInt(br.readLine());
            }catch(IOException ex){}
            if(m12==1){System.out.println(" 输入你修改后的值:");
              try{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                m13=br.readLine();
              }catch(IOException ex){}
              pstmt31.close();
              PreparedStatement pstmt3=DaoCon.getConnection().prepareStatement("Update bus.bus.xianlu set chufadi=? where  bianhao=?");
              pstmt3.setString(1,m13);
              pstmt3.setString(2,m11);
              pstmt3.executeUpdate();
              System.out.println("修改成功!");
            }
            if(m12==2){System.out.println(" 输入你修改后的值:");
              try{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                m13=br.readLine();
              }catch(IOException ex){}
              pstmt31.close();
              PreparedStatement pstmt3=DaoCon.getConnection().prepareStatement("Update bus.bus.xianlu set mudidi=? where  bianhao=?");
              pstmt3.setString(1,m13);
              pstmt3.setString(2,m11);
              pstmt3.executeUpdate();
              System.out.println("修改成功!");
              rs3.close();
            }
            if(m12==3){System.out.println(" 输入你修改后的值:");
              try{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                m13=br.readLine();
              }catch(IOException ex){}
              pstmt31.close();
              PreparedStatement pstmt3=DaoCon.getConnection().prepareStatement("Update bus.bus.xianlu set shijian=? where bianhao=?");
              pstmt3.setString(1,m13);
              pstmt3.setString(2,m11);
              pstmt3.executeUpdate();
              System.out.println("修改成功!");
              rs3.close();
            }

          }
          else{System.out.println("你要更改的项不存在!");}
        }
        if(m==3){
          String m11="";String m13="";int m12=0;
          System.out.println("选择你要修改车次编号：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            m11=br.readLine();
          }catch(IOException ex){}
          PreparedStatement pstmt31=DaoCon.getConnection().prepareStatement("select * from bus.bus.chepiao where bianhao=?");
          pstmt31.setString(1,m11);
          ResultSet rs3=pstmt31.executeQuery();
          if(rs3.next()){
            System.out.println("输入你要修改的项：1.总售票数       2.剩余票数      3.已售票数");
            try{
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
              m12=Integer.parseInt(br.readLine());
            }catch(IOException ex){}
            if(m12==1){System.out.println(" 输入你修改后的值: ");
              try{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                m13=br.readLine();
              }catch(IOException ex){}
              pstmt31.close();
              PreparedStatement pstmt3=DaoCon.getConnection().prepareStatement("Update bus.bus.chepiao set shoupiao=? where  bianhao=?");
              pstmt3.setString(1,m13);
              pstmt3.setString(2,m11);
              pstmt3.executeUpdate();
              System.out.println("修改成功!");
            }

            if(m12==2){System.out.println(" 输入你修改后的值:");
              try{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                m13=br.readLine();
              }catch(IOException ex){}
              pstmt31.close();
              PreparedStatement pstmt3=DaoCon.getConnection().prepareStatement("Update bus.bus.chepiao set shengyu=? where  bianhao=?");
              pstmt3.setString(1,m13);
              pstmt3.setString(2,m11);
              pstmt3.executeUpdate();
              System.out.println("修改成功!");
              rs3.close();
            }

            if(m12==3){System.out.println(" 输入你修改后的值:  ");
              try{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                m13=br.readLine();
              }catch(IOException ex){}
              pstmt31.close();
              PreparedStatement pstmt3=DaoCon.getConnection().prepareStatement("Update bus.bus.chepiao set yishou=? where bianhao=?");
              pstmt3.setString(1,m13);
              pstmt3.setString(2,m11);
              pstmt3.executeUpdate();
              System.out.println("修改成功!");
              rs3.close();
            }
            else{System.out.println("你要更改的项不存在!");}
          }

        }
      }

      if(i==4)
      {
        System.out.println("1.汽车信息删除        2.线路信息删除      3.车票信息删除");
        System.out.println("请选择：");
        int j=0;
        try{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
          j=Integer.parseInt(br.readLine());
        }catch(IOException ex){}
        if(j==1){
          String S1="";
          System.out.println("输入你要删除的汽车信息表中的车次编号：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            S1=br.readLine();
          }catch(IOException ex){}
          PreparedStatement pstmt2=DaoCon.getConnection().prepareStatement("delete from bus.bus.qiche where bianhao=?");
          pstmt2.setString(1,S1);
          pstmt2.executeUpdate();
          System.out.println("已删除!");
          pstmt2.close();
        }
        if(j==2){
          String S2="";
          System.out.println("输入你要删除的线路信息表的车次编号：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            S2=br.readLine();
          }catch(IOException ex){}
          PreparedStatement pstmt2=DaoCon.getConnection().prepareStatement("delete from bus.bus.xianlu where bianhao=?");
          pstmt2.setString(1,S2);
          pstmt2.executeUpdate();
          System.out.println("已删除!");
          pstmt2.close();
        }
        if(j==3){
          String S3="";
          System.out.println("输入你要删除车票信息表的车次编号：");
          try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            S3=br.readLine();
          }catch(IOException ex){}
          PreparedStatement pstmt2=DaoCon.getConnection().prepareStatement("delete from bus.bus.chepiao where bianhao=? ");
          pstmt2.setString(1,S3);
          pstmt2.executeUpdate();
          System.out.println("已删除!");
          pstmt2.close();
        }
        else{System.out.println("你要删除的项不存在!");}
      }
    }
  }
}