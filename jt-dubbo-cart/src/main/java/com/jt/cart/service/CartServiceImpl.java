package com.jt.cart.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.cart.mapper.CartMapper;
import com.jt.cart.pojo.Cart;

//@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartMapper cartMapper;

	@Override
	public List<Cart> findCartListByUserId(Long userId) {
		Cart cart = new Cart();
		cart.setUserId(userId);
		
		return cartMapper.select(cart);
	}

	/**
	 * 1.鏍规嵁userId鍜宨temId鏌ヨ鏁版嵁搴�
	 * 2.濡傛灉鏁版嵁搴撲腑鏈夋暟鎹�,鍒欏仛鏁伴噺鐨勬洿鏂版搷浣�
	 *   濡傛灉鏁版嵁搴撲腑娌℃湁鏁版嵁,鍒欏仛璐墿杞︽柊澧�
	 */
	@Override
	public void saveCart(Cart cart) {
		Cart cartDB = cartMapper.findCartByUI(cart);
		if(cartDB == null){
			cart.setCreated(new Date());
			cart.setUpdated(cart.getCreated());
			cartMapper.insert(cart);
		}else{
			int num = cart.getNum() + cartDB.getNum();
			cartDB.setNum(num); //鏁伴噺鐨勬洿鏂版搷浣�
			cartMapper.updateByPrimaryKeySelective(cartDB);
		}
	}

	@Override
	public void updateCartNum(Cart cart) {
		//鐢变簬鏉′欢闄愬埗 涓嶈兘浣跨敤閫氱敤Mapper
		cart.setUpdated(new Date());
		cartMapper.updateCartNum(cart);
	}
	
	
	
	
	
	
	
	
	
	
	
}
