package jp.co.internous.ecsite.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.internous.ecsite.model.dto.HistoryDto;

@Mapper
public interface TblPurchaseMapper {
	
	List<HistoryDto> findHistory(int userId);
	
	int insert(int userId, int goodsId, String goodsName, int itemCount, int total);
	
	//MyBatisはSQLをJavaファイル・XMLファイル両方に記述できる
	//今回は以下の場合、MyBatisではSQLをXMLファイルに記述する
	//・SQL文が複数行になる場合
	//・DBテーブルを結合する必要がある場合

}
