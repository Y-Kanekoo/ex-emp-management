package com.example.service;

import com.example.domain.Administrator;
import com.example.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 管理者情報の登録、検索などの操作を行うサービス
 */
@Service
@Transactional
public class AdministratorService {

    @Autowired
    private final AdministratorRepository administratorRepository;

    /**
     * AdministratorServiceの新しいインスタンスを生成し、
     * 必要なリポジトリをインジェクションします.
     * @param administratorRepository 管理者リポジトリ
     */

    public AdministratorService(AdministratorRepository administratorRepository) {
        this.administratorRepository = administratorRepository;
    }

    /**
     * 管理者情報を登録します.
     *
     * @param administrator　登録する管理者情報
     */
    public void insert (Administrator administrator){
        administratorRepository.insert(administrator);
    }

    /**
     *  指定されたメールアドレスとパスワードと一致する管理者情報を検索します.
     *
     * @param mailAddress メールアドレス
     * @param password  パスワード
     * @return 一致する管理者が見つかった場合はadministratorをいない場合はnullを返します。
     */
    public Administrator login(String mailAddress, String password) {
        Administrator administrator = administratorRepository.findByMailAddressAndPassword(mailAddress, password);
        return administrator;
    }

}
